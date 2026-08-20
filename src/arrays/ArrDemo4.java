package arrays;

import java.util.Scanner;

public class ArrDemo4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();

        int[] arr = new int[arraySize];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arraySize; i++) {

            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
        System.out.println("Even count is " + evenCount);
        System.out.println("Odd count is " + oddCount);
    }
}
