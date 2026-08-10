package loopingstatements;

import java.util.Scanner;

public class EvenNumbers {
    static Scanner scanner = new Scanner(System.in);

    int sum = 0;

    public void evenNumbers(int offset, int end){
        for(int i = offset; i <= end; i++){
            sum += i;
            System.out.print(sum + " ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter Starting Number : ");
        int offset = scanner.nextInt();

        System.out.print("Enter Ending Number : ");
        int end = scanner.nextInt();

        EvenNumbers en = new EvenNumbers();
        en.evenNumbers(offset, end);
    }
}
