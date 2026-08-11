// Second Case Study :
// Imagine A customer has 10000\- in a bank account and performs 5 transactions. For ecah transaction, enter the
// amount and choose : 1. --> deposit, 2. --> withdraw and update the balance accordingly. If the withdrawal amount
// exceeds the available balance, display "Insufficient balance" and finally display 'final balance', 'total deposited'
// 'total withdrawn'

package casestudiesbyvcube;

import java.util.Scanner;

public class BankTransaction {
    static Scanner scanner = new Scanner(System.in);

    double currenBalance = 10000;
    double totalDeposited = 0;
    double totalWithdrawn = 0;
    double depositAmount;
    double withdrawAmount;

    public void menu() {
        int transactionCount = 0;
        do {
            System.out.println("Welcome to Bank Transaction");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("0. Exit");
            System.out.println("-------------------------");
            System.out.print("choose your transaction : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 0:
                    System.out.println("Thank you for using Bank Transaction");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (transactionCount < 5);
    }

    public void deposit() {
        System.out.print("Enter amount to deposit : ");
        depositAmount = scanner.nextDouble();

        currenBalance += depositAmount;
        totalDeposited += depositAmount;

        System.out.println("You have deposited " + depositAmount + ".");
        System.out.println("-------------------------");

    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw : ");
        withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > currenBalance) {
            System.out.println("Insufficient Balance.");
            System.out.println("-------------------------");
        } else {
            currenBalance -= withdrawAmount;
            totalWithdrawn += withdrawAmount;
            System.out.println("You have withdrawn " + withdrawAmount + ".");
            System.out.println("-------------------------");
        }


    }

    public void display() {
        System.out.println("----------------------------");
        System.out.println("Final Balance : " + currenBalance);
        System.out.println("Total deposited Amount : " + totalDeposited);
        System.out.println("Total withdrawn Amount : " + totalWithdrawn);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        BankTransaction bankTransaction = new BankTransaction();
        bankTransaction.menu();
        bankTransaction.display();

    }
}
