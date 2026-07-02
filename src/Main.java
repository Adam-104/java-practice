//examples of understanding class loader sub system in jvm architecture

import java.io.*;
public class Main{
    public static void main(String[] args) throws ClassNotFoundException{

        //bootstrap class loader is responsible for all java classes to load which not requires additional
        //setting paths like String, System, ArrayLists, etc..,
        Class.forName("java.lang.String");
        Class.forName("java.lang.System");

        //application class loader is responsible for loading classes from external sources like connecting
        //databases and loading user defined classes.
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("this is main method");
    }
}