package loopingstatements;

import java.util.Scanner;

public class SumOfEvenNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void sumOfEvenNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.print("enter starting number : ");
        int start = scanner.nextInt();
        System.out.print("enter ending number : ");
        int end = scanner.nextInt();

        sumOfEvenNumbers(start, end);
    }
}
