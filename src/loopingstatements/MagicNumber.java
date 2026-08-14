package loopingstatements;

import java.util.Scanner;

public class MagicNumber {
    static Scanner scanner = new Scanner(System.in);

    public boolean magicNumber(int number) {
        while (number > 9) {
            int sum = 0;
            while (number > 0) {
                int rem = number % 10;
                number = number / 10;
                sum = sum + rem;
            }
            number = sum;
        }
        return number == 1;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        MagicNumber m = new MagicNumber();

        boolean result = m.magicNumber(number);

        if (result) {
            System.out.println("Given number is a magic number");
        } else {
            System.out.println("Given number is not a magic number");
        }
    }
}
