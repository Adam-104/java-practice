//Create a Java program that performs the following operations:
//Use separate catch blocks for all three exceptions.

package exceptionhandling.example1;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//      Ask the user to enter two numbers as Strings.
        System.out.println("Enter a string : ");
        String s1 = scanner.nextLine();

        System.out.println("Enter a String : ");
        String s2 = scanner.nextLine();

//      Convert the Strings into integers using Integer.parseInt().
        try {
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            System.out.print("Enter a number : ");
            int num3 = scanner.nextInt();

            System.out.print("Enter another number : ");
            int num4 = scanner.nextInt();

//          Divide the first number by the second number.
            System.out.println(num3 / num4);

//         Handle ArithmeticException if the second number is 0.

//        Create an integer array containing 5 elements.
            int[] arr = {1, 2, 3, 4, 5};

//        Ask the user to enter an array index and display the element at that index.
            System.out.print("Enter index value for accessing for values in an array: ");
            int index = scanner.nextInt();
            System.out.println(arr[index]);
//         Handle ArithmeticException if the second number is 0.
        } catch (ArithmeticException e) {
            e.printStackTrace();
//         Handle ArrayIndexOutOfBoundsException if the index is invalid.
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
//            If the user enters an invalid number while converting the String to an integer,
//            handle NumberFormatException.
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

    }
}
