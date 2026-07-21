package methods;

public class BankAccount {
    String customerName;
    String accountType;
    double accountNumber;
    double balance;
    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.customerName = "akon";
        bankAccount.accountType = "savings";
        bankAccount.accountNumber = 657849034;
        bankAccount.balance = 199999;
        bankAccount.displayAccountDetails();
    }
}
