package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrDemo3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array size : ");
        int arraySize = scanner.nextInt();
        System.out.println("Enter array elements : ");
        int[] array = new int[arraySize];

        int sum = 0;
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
            average = sum / array.length;
        }
        System.out.println("Array Elements : " + Arrays.toString(array));
        System.out.println("Sum Of Array Elements : " + sum);
        System.out.println("Average of Array Elements : " + average);
    }
}
