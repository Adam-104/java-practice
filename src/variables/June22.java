package variables;

public class June22 {
    int sid;
    String sname;
    int sage;
    String address;
    public static void main(String[] args){
        June22 s1 = new June22();
        s1.sid = 001;
        s1.sname = "akon";
        s1.sage = 18;
        s1.address = "KPHB Phase 1";

        System.out.println("Student1 information: ");
        System.out.println("Student ID: " + s1.sid);
        System.out.println("Student name: " + s1.sname);
        System.out.println("Student age: "+ s1.sage);
        System.out.println("Stuednt address: " + s1.address);
        System.out.println();

        June22 s2 = new June22();
        s2.sid = 002;
        s2.sname = "bkon";
        s2.sage = 20;
        s2.address = "Ameerpet";

        System.out.println("Student2 information: ");
        System.out.println("Student ID: " + s2.sid);
        System.out.println("Student age: "+ s2.sage);
        System.out.println("Stuednt address: " + s2.address);
    }
}
