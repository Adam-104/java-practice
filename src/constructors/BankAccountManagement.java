package constructors;

public class BankAccountManagement {
    String accountHolderName;
    long accountNumber;
    double balance;

    BankAccountManagement(){
        this("unknown");
    }

    BankAccountManagement(String accountHolderName){
        this(accountHolderName, 0);
    }

    BankAccountManagement(String accountHolderName, long accountNumber) {
        this(accountHolderName, accountNumber, 0);
    }

    public BankAccountManagement(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber =  accountNumber;
        this.balance = balance;
    }

    public void accountDetails(){
        System.out.println("Account Details");
        System.out.println("-------------------------------");
        System.out.println("Name of the Account Holder  : " + accountHolderName);
        System.out.println("Account Number              : " + accountNumber);
        System.out.println("Balance                     : ₹" + balance);
        System.out.println("------------------------------");
    }

    public static void main(String[] args){
        BankAccountManagement holder1 = new BankAccountManagement();
        holder1.accountDetails();

        BankAccountManagement holder2 = new BankAccountManagement("akon");
        holder2.accountDetails();

        BankAccountManagement holder3 = new BankAccountManagement("akon", 12345678945L);
        holder3.accountDetails();

        BankAccountManagement holder4 = new BankAccountManagement("akon", 12345678945L, 5000);
        holder4.accountDetails();
    }
}
