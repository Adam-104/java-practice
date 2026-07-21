package methods;

import java.util.Scanner;

public class SimpleCalculator {
    static Scanner scanner =new Scanner(System.in);
    public void addition(){
        System.out.println("********** Addition Calculator *********");
        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Addition of two numbers:" + (firstNumber + secondNumber));
    }
    public void subtraction(){
        System.out.println("********** Subtraction Calculator *********");
        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Subtraction of two numbers:" + (firstNumber - secondNumber));
    }
    public void multiplication(){
        System.out.println("********** Multiplication Calculator *********");
        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Multiplication of two numbers:" + (firstNumber * secondNumber));
    }
    public void division(){
        System.out.println("********** Division Calculator *********");
        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Division of two numbers:" + (firstNumber / secondNumber));
    }
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();
        scanner.close();
    }
}
