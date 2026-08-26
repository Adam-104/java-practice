//Write a Java program to perform the following operations on a 3 × 3 integer matrix:
//        Reverse the elements of every even-indexed row (rows 0 and 2).
//        Multiply every element of the odd-indexed row (row 1) by 2, except the middle element (1,1).
//        Square all the elements on the main (left) diagonal.
//        Display the modified matrix.
//        Input
//        1 2 3
//        4 5 6
//        7 8 9
//        Output
//        9   2   1
//        8  25   12
//        9   8  49

package arrays.multidimensionalArrays;

import java.util.Scanner;

public class MultiDimArrDemo2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i = i + 2) {
            int start = 0;
            int end = 2;

            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (j != 1) {
                matrix[1][j] = matrix[1][j] * 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            matrix[i][i] = matrix[i][i] * matrix[i][i];
        }

        System.out.println("modified matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
