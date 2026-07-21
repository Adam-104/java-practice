package methods;
import java.util.Scanner;

public class Methods2 {
    public void  empDetails(){

    }

    public void  empName(String firstName, String lastName){
        System.out.println("Name of the Employee: " + firstName + " " + lastName);
    }

    public void empId(int id){
        System.out.println("ID of the Employee: " + id);
    }


    public static void main(String[] args) {
        Methods2 m = new Methods2();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter last name: ");
        String lastName = input.nextLine();
        m.empName(firstName, lastName);

    }
}
