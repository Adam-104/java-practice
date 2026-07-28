package constructors;

public class Students {
    int rollNo;
    String name;
    String branch;
    int year;
    double cgpa;

    Students(Students s){
        this(s.rollNo, s.name, s.branch, s.year, s.cgpa);
    }

    Students(Students s, int year){
        this(s.rollNo, s.name, s.branch, year, s.cgpa);
    }

    Students(Students s, String branch){
        this(s.rollNo, s.name, branch, s.year, s.cgpa);
    }

    Students(Students s, double cgpa){
        this(s.rollNo, s.name, s.branch, s.year, cgpa);
    }

    Students(Students s, String branch, int year, double cgpa){
        this(s.rollNo, s.name, branch, year, cgpa);
    }

    Students(int rollNo, String name, String branch, int year, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.cgpa = cgpa;
    }

    public void studentDetails(){
        System.out.println("Student Details");
        System.out.println("-------------------------");
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Name      : " + name);
        System.out.println("Branch    : " + branch);
        System.out.println("Year      : " + year);
        System.out.println("CGPA      : " + cgpa);
        System.out.println("-------------------------");
    }

    public static void main(String[] args){
        Students student1 = new Students(1, "akon", "cse", 1, 7.8);
        student1.studentDetails();

        Students student2 = new Students(student1);
        student2.studentDetails();

        Students student3 = new Students(student1, 2);
        student3.studentDetails();

        Students student4 = new Students(student3, "ece");
        student4.studentDetails();

        Students student5 = new Students(student4, 8.2);
        student5.studentDetails();

        Students student6 = new Students(student4, "civil", 3, 8.5);
        student6.studentDetails();
    }
}
