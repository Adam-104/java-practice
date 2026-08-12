package loopingstatements;

import java.util.Scanner;

public class Palindrome {
    static Scanner scanner = new Scanner(System.in);

    public boolean isPalindrome(int number) {
        boolean result = false;
        int temp = number;
        int rem = 0;
        int rev = 0;
        while(number > 0){
            rem = number % 10; //121%10 -> 1, 12%10 -> 2, 1%10 -> 1
            number = number / 10; //121/10 -> 12, 12/10 -> 1, 1/10 -> 0
            rev = rev * 10 + rem; //0 * 10 +1 -> 1, 1*10 + 2 -> 12, 12 * 10 + 1 -> 121
        }

        if(rev == temp){
            result = true;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        Palindrome palindrome = new Palindrome();

        boolean result = palindrome.isPalindrome(number);

        if(result){
            System.out.println("The number is a palindrome number");
        }else{
            System.out.println("The number is not a palindrome number");
        }
    }
}
