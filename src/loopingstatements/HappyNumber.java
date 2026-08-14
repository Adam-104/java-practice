package loopingstatements;

import java.util.Scanner;

public class HappyNumber {
    static Scanner scanner = new Scanner(System.in);

    public boolean happyNumber(int number){

        while(number > 9){
            int sum = 0;
            while(number > 0){
                int rem = number % 10;
                number = number / 10;
                sum = sum + (rem * rem);
            }
            number = sum;
        }
        return number == 1;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        HappyNumber h = new HappyNumber();

        boolean result = h.happyNumber(number);

        if (result) {
            System.out.println("The number is happy");
        }else{
            System.out.println("The number is not happy");
        }
    }
}
