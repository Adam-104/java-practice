package variables;//  example code for understanding instance and static variables

//  1. instance variables:
//  instance variables are only accessible by only object reference variable (object)

//  2. static variables:
//  static variables are accessible by directly or using class name or object reference variable
//  most recommend way to access static variables are using class name

public class Variables {
    //  Declaring instance variables or non-static variables (because we can declare variables without static keyword)
    int instVar1;
    String instVar2;

    //  Declaring static variables
    static int statVar1;
    static String statVar2;

    public static void main(String[] args){
        //  Accessing static variables
        System.out.println("---------Accessing static variables without initialization---------");
        System.out.println(statVar1); //    if we don't initialize values to static variables jvm provides default values respective of their data types
        System.out.println(statVar2); //    for integer type it gives 0 & for String type it gives null

        //  Acessing instance variables without creating object reference it gives error
        //  System.out.println(instVar1);
        //  System.out.println(instVar2); //    it gives this error --> java: non-static variable instVar1 cannot be referenced from a static context

        //Accessing instance variables using object reference variable
        System.out.println("---------Accessing Instance variables without initialization---------");
        Variables var = new Variables(); // object creation
        System.out.println(var.instVar1);
        System.out.println(var.instVar2);

        // Initializing values to the instance and static variables
        statVar1 = 101;
        statVar2 = "adam";

        var.instVar1 = 102;
        var.instVar2 = "vinay";

        System.out.println("-------Accessing static variables-------");
        System.out.println("Static variable 1: " + statVar1);
        System.out.println("Static variable 2: " + statVar2);

        System.out.println("-------Accessing instance  variables-------");
        System.out.println("Instance variable1: " + var.instVar1);
        System.out.println("Instance variable2: " + var.instVar2);
    }
}
