package loopingstatements;

import java.util.Scanner;

public class PerfectOrNot {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isPerfect(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();


        if (isPerfect(n)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}
