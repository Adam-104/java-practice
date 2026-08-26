package arrays.multidimensionalArrays;

import java.util.Scanner;

public class MulDimArrDemo1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter number of rows : ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.println("Enter array elements : ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter array elements : ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        scanner.close();
    }
}
