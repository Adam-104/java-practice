package loopingstatements;

import java.util.Scanner;

public class ReverseOfGivenNumber {
    static Scanner scanner = new Scanner(System.in);

    public int reverseOfGivenNumber(int number) {
        int rem = 0;
        int rev = 0;
        while (number > 0) {
            rem = number % 10;
            number = number / 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        ReverseOfGivenNumber reverseNumber = new ReverseOfGivenNumber();
        int result = reverseNumber.reverseOfGivenNumber(number);
        System.out.println("Reverse of given number is " + result);

    }
}
