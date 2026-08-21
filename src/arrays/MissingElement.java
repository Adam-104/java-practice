package arrays;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing element : " + missing);
    }
}
