package constructors;

public class Student {

    int id;
    String name;
    int marks;
    String course;
    String address;

    Student(){
        this(1);
    }

    Student(int id){
        this(id, "akon");
    }

    Student(int id, String name){
        this(id, name, 95);
    }

    Student(int id, String name, int marks){
        this(id, name, marks, "java");
    }

    Student(int id, String name, int marks, String course){
        this(id, name, marks, course, "Vijayawada");
    }

    Student(int id, String name, int marks, String course, String address){
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.course = course;
        this.address = address;
    }

    void studentInfo(){
        System.out.println("Student Details");
        System.out.println("---------------------");
        System.out.println("ID of the Student      : " + id);
        System.out.println("Name of the Student    : " + name);
        System.out.println("Marks of the Student   : " + marks);
        System.out.println("Course of the Student  : " + course);
        System.out.println("Address of the Student : " + address);
        System.out.println("---------------------");
    }

    public static void main(String[] args){
        Student student1 = new Student();
        student1.studentInfo();

        Student student2 = new Student(2, "bkon");
        student2.studentInfo();

        Student student3 = new Student(3, "ckon", 100);
        student3.studentInfo();

        Student student4 = new Student(4, "dkon", 97, "testing");
        student4.studentInfo();

        Student student5 = new Student(5, "ekon", 98, "devops", "ongole");
        student5.studentInfo();
    }
}
