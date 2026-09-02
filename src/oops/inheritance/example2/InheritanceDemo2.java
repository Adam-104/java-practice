package oops.inheritance.example2;

class Person{

    String name;
    int age;

}

class Student extends Person{

    String collegeName;

    public void studentInfo(){
        System.out.println("Student Info");
        System.out.println("Student Name : "         + name);
        System.out.println("Student Age : "          + age);
        System.out.println("Student College Name : " + collegeName);
        System.out.println("--------------------------------------");
    }

}

public class InheritanceDemo2 {

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Adam";
        student.age = 21;
        student.collegeName = "V CUBE";
        student.studentInfo();
    }

}
