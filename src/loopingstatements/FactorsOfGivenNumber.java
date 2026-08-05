package loopingstatements;

import java.util.Scanner;

public class FactorsOfGivenNumber {
    static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        FactorsOfGivenNumber factors = new FactorsOfGivenNumber();
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        factors.findFactors(number);
    }
    public void findFactors(int number){
        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(number);
    }
}
