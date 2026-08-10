package loopingstatements;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
            System.out.print(sum + " ");
        }
    }
}
