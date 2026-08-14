package loopingstatements;

import java.util.Scanner;

public class PrimeNumbers {
    static Scanner scanner = new Scanner(System.in);

    public void primeNumbers(int start, int end) {

        for (int i = start; i <= end; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter start number : ");
        int start = scanner.nextInt();

        System.out.print("Enter end number : ");
        int end = scanner.nextInt();

        PrimeNumbers p = new PrimeNumbers();
        p.primeNumbers(start, end);
    }
}