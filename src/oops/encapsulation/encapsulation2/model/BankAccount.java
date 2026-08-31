package oops.encapsulation.encapsulation2.model;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount() {}

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void getAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setBalance(double balance) {
        if(balance <= 0){
            System.out.println("Balance cannot be negative and zero!");
        }else{
            this.balance = balance;
        }
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount < 0){
            System.out.println("Amount must be greater than zero");
            return;
        }else{
            this.balance += amount;
            System.out.println(amount + " deposited to the account");
        }
    }

    public void withdraw(double amount) {
        if(amount < 0){
            System.out.println("withdrawal amount must be greater than zero");
        }else if(amount > balance){
            System.out.println("withdrawal amount must be less than balance");
        }else{
            this.balance -= amount;
            System.out.println(amount + " withdrawn from the account");
        }
    }

    public void acctInfo() {
        System.out.println("*******************************************");
        System.out.println("Account Number        : " + accountNumber);
        System.out.println("Account Holder Name   : " + accountHolderName);
        System.out.println("Balance               : " + balance);
        System.out.println("*******************************************");
    }
}
