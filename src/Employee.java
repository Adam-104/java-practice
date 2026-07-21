public class Employee {
    int empId;
    String empName;
    int empGrade;
    double empSalary;
    double empExperience;
    double workingDays;
    long phnNumber;
    double bonusAmount;

    public void display(){
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Grade : "+empGrade);
        System.out.println("Employee Salary : "+empSalary);
        System.out.println("Employee Experience : "+empExperience);
        System.out.println("Employee WorkingDays : "+workingDays);
        System.out.println("Employee Bonus Amount : "+bonusAmount);
        System.out.println("Employee Contact Details : " + phnNumber);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empId = 1;
        emp.empName = "akon";
        emp.empGrade = 2;
        emp.empSalary = 50000;
        emp.empExperience = 2.5;
        emp.workingDays = 27.5;
        emp.phnNumber = 9798767899L;
        emp.bonusAmount = 2500;
        emp.display();
    }
}
