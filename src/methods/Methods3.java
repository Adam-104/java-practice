package methods;

import java.util.Scanner;

public class Methods3 {
    static Scanner input = new Scanner(System.in);


    double getPrincipalAmount(){
        System.out.println("Enter Principal Amount: ");
        return input.nextDouble();
    }
    double getTime(){
        System.out.println("Enter Time : ");
        return input.nextDouble();
    }
    double getRateOfInterest(){
        System.out.println("Enter Rate of Interest: ");
        return input.nextDouble();
    }
    double getSimpleInterest(double amount, double time, double rate){
        return (amount * time * rate)/100;
    }


    public static void main(String[] args) {
        Methods3 obj = new Methods3();
        double amount = obj.getPrincipalAmount();
        double time = obj.getTime();
        double rate = obj.getRateOfInterest();
        double simpleInterest = obj.getSimpleInterest(amount, time, rate);
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
