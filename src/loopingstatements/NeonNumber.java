package loopingstatements;


import java.util.Scanner;

//number = 9
//if number is said be a neon number then sum of its digits of their square = original number (9)
public class NeonNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int square = number * number;
        int sum = 0;

        for (; square > 0; square = square / 10) {
            sum = sum + (square % 10);
        }

        if (sum == number) {
            System.out.println("Given number is neon");
        } else {
            System.out.println("Given number is not neon");
        }
    }
}
