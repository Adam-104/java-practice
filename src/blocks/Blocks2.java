package blocks;

public class Blocks2 {
    static String companyName;
    static String location;
    String empName;
    double salary;

    static {
        companyName = "Vcube";
        location = "KPHP";
    }

    public static void main(String[] args) {
        Blocks2 emp1 = new Blocks2();
        emp1.empName = "akon";
        emp1.salary = 500000;

        Blocks2 emp2 = new Blocks2();
        emp2.empName = "bkon";
        emp2.salary = 600000;

        System.out.println("Details of the First Employee");
        System.out.println("Company Name: " + companyName);
        System.out.println("Location of the Company: " + location);
        System.out.println("Name of the Employee: " + emp1.empName);
        System.out.println("Salary of the Employee: " + emp1.salary);
        System.out.println();
        System.out.println("Details of the Second Employee");
        System.out.println("Company Name: " + companyName);
        System.out.println("Location of the Company: " + location);
        System.out.println("Name of the Employee: " + emp2.empName);
        System.out.println("Salary of the Employee: " + emp2.salary);
    }
}
