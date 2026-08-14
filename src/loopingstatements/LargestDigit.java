package loopingstatements;

import java.util.Scanner;

public class LargestDigit {
    static Scanner scanner = new Scanner(System.in);

    public int largestDigit(int number) {
        int largest = 0;
        int rem = 0;
        while (number > 0) {
            rem = number % 10;
            number = number / 10;

            if (rem > largest) {
                largest = rem;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        LargestDigit l = new LargestDigit();

        int result = l.largestDigit(number);

        System.out.println("Largest Digit of given number is : " + result);
    }
}
