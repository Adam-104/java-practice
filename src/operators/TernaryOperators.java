package operators;

import java.util.Scanner;

public class TernaryOperators {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 90;

        System.out.println("-------------------------");
        String num = (a < 0) ? "positive" : "negative"; // normal ternary operator
        System.out.println("Given Number is : " + num);
        System.out.println("-------------------------");

        System.out.print("Enter Marks: ");
        double marks =  scanner.nextDouble();
        String result = (marks >= 90) ? "A"               // nested ternary operator
                    : (marks >= 75) ? "B"
                      : (marks >= 60) ? "C"
                        : (marks >= 40) ? "D"
                          : "Fail";
        System.out.println("Result of the Student : " + result);
        scanner.close();
    }
}
