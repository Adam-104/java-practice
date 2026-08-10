package loopingstatements;

import java.util.Scanner;

public class SumOfEvenNumbers {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
