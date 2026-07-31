package logicalstatements;

import java.util.Scanner;

public class DigitCheck {
    //Here, we can check the number of digits of an integer using if elseif logical statement.
    static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter any integer : ");
        int number = scanner.nextInt();

        number = Math.abs(number); //Math.abs(number) handles the negative integers.

        if (number >= 10 && number <= 99){
            System.out.println("Given number has two digits.");
        } else if (number >= 100 && number <= 999){
            System.out.println("Give number has three digits.");
        }else if (number >= 1000){
            System.out.println("Given number has more than three digits.");
        } else {
            System.out.println("Given number has only one digit.");
        }

        scanner.close();
    }
}
