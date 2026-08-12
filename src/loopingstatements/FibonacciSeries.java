package loopingstatements;

import java.util.Scanner;

public class FibonacciSeries {
    static Scanner scanner = new Scanner(System.in);

    public void fibonacci(int range) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Fibonacci Series");
        System.out.print(n1 + " " + n2  + " " );
        while(true){
            n3 = n1 + n2;

            if(n3>range){
                break;
            }

            System.out.print(n3 + " ");
            n1 =n2;
            n2 =n3;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the range upto you want to print Fibonacci series : ");
        int range = scanner.nextInt();
        FibonacciSeries f = new FibonacciSeries();
        f.fibonacci(range);
    }
}
