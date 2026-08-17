package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrDemo2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array size : ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.print("Enter array elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        int[] positiveArray = new int[positiveCount];
        int[] negativeArray = new int[negativeCount];
        int[] zeroArray = new int[zeroCount];

        int positiveIndex = 0;
        int negativeIndex = 0;
        int zeroIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveArray[positiveIndex] = array[i];
                positiveIndex++;
            } else if (array[i] < 0) {
                negativeArray[negativeIndex] = array[i];
                negativeIndex++;
            } else {
                zeroArray[zeroIndex] = array[i];
                zeroIndex++;
            }
        }
        for (int i = 0; i < positiveArray.length; i++) {
            System.out.print(positiveArray[i] + " ");
        }

        System.out.println("\nThe size of the positive array is : " + positiveArray.length);

        for (int i = 0; i < negativeArray.length; i++) {
            System.out.print(negativeArray[i] + " ");
        }

        System.out.println("\nThe size of the negative array is : " + negativeArray.length);

        for (int i = 0; i < zeroArray.length; i++) {
            System.out.print(zeroArray[i] + " ");
        }

        System.out.println("\nThe size of the zero array is : " + zeroArray.length);
    }
}
