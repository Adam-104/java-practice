package loopingstatements;

import java.util.Scanner;

public class MultiplicationTable {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your number to get the table : ");
        int number = scanner.nextInt();

        System.out.print("Enter the range upto ou want to multiply : ");
        int range = scanner.nextInt();

        for (int i = 1; i <= range; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
