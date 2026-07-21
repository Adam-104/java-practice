package methods;

import java.util.Scanner;

public class SalarySlipGenerator {
    static Scanner sc = new Scanner(System.in);

    double basicSalary(){
        System.out.println("Enter basic salary");
        return sc.nextDouble();
    }
    double hraSalary(double baseSalary){
        return (baseSalary * 20 / 100);
    }
    double da(double baseSalary){
        return (baseSalary * 10 / 100);
    }
    double grossSalary(double baseSalary, double hrSalary, double daSalary){
        return baseSalary + hrSalary + daSalary;
    }
    public static void main(String[] args) {
        SalarySlipGenerator salarySlipGenerator = new SalarySlipGenerator();
        double baseSalary = salarySlipGenerator.basicSalary();
        double hra =  salarySlipGenerator.hraSalary(baseSalary);
        double da = salarySlipGenerator.da(baseSalary);
        double gs = salarySlipGenerator.grossSalary(baseSalary, hra, da);

        System.out.println("****** Employee Salary Slip ******");
        System.out.println("Basic Salary: " + baseSalary);
        System.out.println("HR Salary: " + hra);
        System.out.println("Da Salary: " + da);
        System.out.println("Gross Salary: " + gs);
    }
}
