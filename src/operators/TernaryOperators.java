package operators;

import java.util.Scanner;

public class TernaryOperators {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 90;

        //Checking the given number is positive or negative
        System.out.println("-------------------------");
        String num = (a < 0) ? "positive" : "negative"; // normal ternary operator
        System.out.println("Given Number is : " + num);
        System.out.println("-------------------------");

        //Assigning grades using ternary operator
        System.out.print("Enter Marks : ");
        double marks =  scanner.nextDouble();
        String result = (marks >= 90) ? "A"               // nested ternary operator
                    : (marks >= 75) ? "B"
                      : (marks >= 60) ? "C"
                        : (marks >= 40) ? "D"
                          : "Fail";
        System.out.println("Result of the Student : " + result);
        System.out.println("-------------------------");

        //checking the given character is vowel or consonant
        System.out.print("Enter your Character : ");
        char ch = scanner.next().charAt(0);
        String number = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                        ? "vowel"
                        : "consonant";

        //simple calculator using ternary operator
        System.out.println(ch + " is a " + number);
        System.out.println("-------------------------");

        System.out.print("Enter first value : ");
        double x = scanner.nextDouble();

        System.out.print("Enter second value : ");
        double y = scanner.nextDouble();

        System.out.print("Enter your operator : ");
        char operator = scanner.next().charAt(0);

        double output = (operator == '+') ? x + y
                        : (operator == '-') ? x - y
                        : (operator == '*') ? x * y
                        : (operator == '/') ? x / y
                        : (operator == '%') ? x % y
                        : Double.NaN;

        System.out.println("calculated value of " + x + operator + y + " is " + output);

        scanner.close();
    }
}
