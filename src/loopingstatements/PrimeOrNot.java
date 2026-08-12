package loopingstatements;

import java.util.Scanner;

public class PrimeOrNot {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number to check if it is prime or not : ");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (number > 1 && count == 0) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}

