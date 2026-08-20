package arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static Scanner scanner = new Scanner(System.in);

    public int[] bubbleSort(int[] arr) {
        int temp = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                    count2++;
                }
            }
            count1++;
            if(!flag) {
                break;
            }
        }
        System.out.println("Number of rotations : " + count1);
        System.out.println("Number of swapping's : " + count2);
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array elements before sorting : " + Arrays.toString(arr));

        BubbleSort b = new BubbleSort();
        int[] result = b.bubbleSort(arr);

        System.out.println("Array elements after sorting : " + Arrays.toString(result));
    }
}
