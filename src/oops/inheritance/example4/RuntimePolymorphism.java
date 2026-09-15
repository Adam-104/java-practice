//1.Create a parent class Student with method calculateGrade().
//Create child classes EngineeringStudent, MedicalStudent, ManagementStudent overriding it
// with their own grading criteria.
//Accept marks from user.
//Use a parent class reference to hold child objects.
//Demonstrate runtime polymorphism by calling calculateGrade().

package oops.inheritance.example4;

import java.util.Scanner;

class Student {
    public void calculateGrade() {
    }
}

class EngineeringStudent extends Student {
    static Scanner scanner = new Scanner(System.in);
    int totalMarks = scanner.nextInt();

    public void calculateGrade() {
        if (totalMarks >= 540 && totalMarks <= 600) {
            System.out.println("Grade of the student is : A+");
        } else if (totalMarks >= 480 && totalMarks <= 539) {
            System.out.println("Grade of the student is : A");
        } else if (totalMarks >= 420 && totalMarks <= 479) {
            System.out.println("Grade of the student is : B+");
        } else if (totalMarks >= 360 && totalMarks <= 419) {
            System.out.println("Grade of the student is : B");
        } else if (totalMarks >= 300 && totalMarks <= 359) {
            System.out.println("Grade of the student is : C");
        } else if (totalMarks >= 240 && totalMarks <= 299) {
            System.out.println("Grade of the student is : D");
        } else {
            System.out.println("Grade of the student is : F");
        }

    }
}

class MedicalStudent extends Student {
    static Scanner scanner = new Scanner(System.in);
    int totalMarks = scanner.nextInt();

    public void calculateGrade() {
        if (totalMarks >= 900 && totalMarks <= 1000) {
            System.out.println("Grade of the student is : A+");
        } else if (totalMarks >= 800 && totalMarks <= 899) {
            System.out.println("Grade of the student is : A");
        } else if (totalMarks >= 700 && totalMarks <= 799) {
            System.out.println("Grade of the student is : B+");
        } else if (totalMarks >= 600 && totalMarks <= 699) {
            System.out.println("Grade of the student is : B");
        } else if (totalMarks >= 500 && totalMarks <= 599) {
            System.out.println("Grade of the student is : C");
        } else if (totalMarks >= 400 && totalMarks <= 499) {
            System.out.println("Grade of the student is : D");
        } else {
            System.out.println("Grade of the student is : F");
        }
    }
}

class ManagementStudent extends Student {
    static Scanner scanner = new Scanner(System.in);
    int totalMarks = scanner.nextInt();

    public void calculateGrade() {
        if (totalMarks >= 630 && totalMarks <= 700) {
            System.out.println("Grade of the student is : O");
        } else if (totalMarks >= 560 && totalMarks <= 629) {
            System.out.println("Grade of the student is : A+");
        } else if (totalMarks >= 490 && totalMarks <= 559) {
            System.out.println("Grade of the student is : A");
        } else if (totalMarks >= 420 && totalMarks <= 489) {
            System.out.println("Grade of the student is : B+");
        } else if (totalMarks >= 350 && totalMarks <= 419) {
            System.out.println("Grade of the student is : B");
        } else if (totalMarks >= 280 && totalMarks <= 349) {
            System.out.println("Grade of the student is : C");
        } else {
            System.out.println("Grade of the student is : F");
        }
    }
}

public class RuntimePolymorphism {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter which type of student grade you want to look : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Student engineeringStudent = new EngineeringStudent();
                engineeringStudent.calculateGrade();
                break;
            case 2:
                Student medicalStudent = new MedicalStudent();
                medicalStudent.calculateGrade();
                break;
            case 3:
                Student managementStudent = new ManagementStudent();
                managementStudent.calculateGrade();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
