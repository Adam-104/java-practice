//1.Write a Java program to read an N × N integer matrix from the user.
// Replace every even number in the matrix with 0 and every odd number with -1.
// Display the modified matrix.
//Input
//        1 2 3
//        4 5 6
//        7 8 9
//Output
//         -1  0  -1
//        0  -1   0
//        -1  0  -1
package arrays.multidimensionalArrays;

import java.util.Scanner;

public class MultiDimArrDemo3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of rows : ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] % 2 == 0){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = -1;
                }
            }
        }

        System.out.println("Modified Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
