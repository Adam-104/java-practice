package loopingstatements;

import java.util.Scanner;

public class SumOfDigits {
    static Scanner scanner = new Scanner(System.in);

    public static int sumOfDigits(int number) {
        int sum = 0;
        int rem = 0;
        while (number > 0) {
            rem = number % 10;
            sum += rem;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int sum = sumOfDigits(number);

        System.out.println("Sum of digits of given number is " + sum);
    }
}
