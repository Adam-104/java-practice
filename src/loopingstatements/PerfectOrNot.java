package loopingstatements;

import java.util.Scanner;

public class PerfectOrNot {
    static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args){
        PerfectOrNot p = new PerfectOrNot();

        System.out.print("Enter any number : ");
        int n = scanner.nextInt();

        p.perfectOrNot(n);

        boolean result = p.perfectOrNot(n);

        if(result){
            System.out.println("Given number is perfect.");
        }else{
            System.out.println("Given number is not perfect.");
        }
    }

    public boolean perfectOrNot(int n){
        boolean flag = false;
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
            if (sum == n){
                flag = true;
            }
        }
        return flag;
    }
}
