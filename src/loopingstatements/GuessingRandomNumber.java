//1.Write a Java program that generates a random number between 1 and 10.
// The user gets 3 chances to guess the number.
//If the user guesses correctly, display "You Won!" and stop the game.
//If all 3 attempts are wrong, display "You Lost!" and show the random number.

package loopingstatements;

import java.util.Random;
import java.util.Scanner;

public class GuessingRandomNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        for(int i = 0; i < 3; i++){
            System.out.print("enter your guessing number : ");
            int guessNumber = scanner.nextInt();

            if(guessNumber==randomNumber){
                System.out.println("You Won!");
                break;
            }else{
                System.out.println("Wrong Guess!");
                if(i == 3){
                    System.out.println("you lost");
                    System.out.println("Random Number was : " + randomNumber);

                }
            }
        }
        scanner.close();
    }
}
