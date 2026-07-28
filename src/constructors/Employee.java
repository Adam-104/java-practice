package constructors;

public class Employee {
    int empId;
    String empName;
    double empSalary;

    Employee(Employee e, String empName,  double empSalary){
        this(e.empId, empName, empSalary);
    }

    Employee(int empId, String empName, double empSalary){
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public void empInfo(){
        System.out.println("Employee Details");
        System.out.println("----------------------");
        System.out.println("Employee ID       : " + empId);
        System.out.println("Employee Name     : " + empName);
        System.out.println("Employee Salary   : " + empSalary);
        System.out.println("----------------------");
    }

    public static void main (String[] args){
        Employee emp1 = new Employee(101, "akon", 500000);
        emp1.empInfo();

        Employee emp2 = new Employee(emp1, "bkon", 600000);
        emp2.empInfo();
    }
}
