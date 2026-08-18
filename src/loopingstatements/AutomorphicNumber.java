package loopingstatements;

import java.util.Scanner;

public class AutomorphicNumber {
    static Scanner scanner = new Scanner(System.in);

    public boolean automorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }

            square = square / 10;
            temp = temp / 10;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        AutomorphicNumber a = new AutomorphicNumber();
        boolean result = a.automorphicNumber(number);

        if (result) {
            System.out.println("Given number is Automorphic Number");
        } else {
            System.out.println("Given number is not Automorphic Number");
        }
    }
}
