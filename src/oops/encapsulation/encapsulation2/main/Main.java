package oops.encapsulation.encapsulation2.main;
import oops.encapsulation.encapsulation2.model.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(12345);
        bankAccount.setAccountHolderName("Adamu");
        bankAccount.setBalance(-10);

        bankAccount.acctInfo();
    }
}
