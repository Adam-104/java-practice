package loopingstatements;

import java.util.Scanner;

public class PerfectNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static boolean perfectNumbers(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("Perfect Numbers are : ");
        for (int i = start; i <= end; i++) {
            if (perfectNumbers(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
