//A Hospital wants to develop a system to manage different employee roles such as Doctor, Nurse, and
//Receptionist using OOP concepts.
//Create a parent class Employee with a method work() that displays "Working".
//Create child classes Doctor, Nurse, and Receptionist that override the work() method with
// their respective responsibilities
//Int the main() method, use a single employee reference to create objects of each child class and call the work()
//method

package casestudiesbyvcube;

class Employee{
    public void work(){
        System.out.println("Employee is working.");
    }
}
class Doctor extends Employee{
    @Override
    public void work(){
        System.out.println("Doctor is treating patients.");
    }
}
class Nurse extends Employee{
    @Override
    public void work(){
        System.out.println("Nurse taking care of patients.");
    }
}
class Receptionist extends Employee{
    @Override
    public void work(){
        System.out.println("Receptionist talking with patients and make their bills.");
    }
}

public class CaseStudy6 {
    public static void main(String[] args) {
        Employee doctor = new Doctor();
        Employee nurse = new Nurse();
        Employee receptionist = new Receptionist();
        doctor.work();
        nurse.work();
        receptionist.work();
    }
}
