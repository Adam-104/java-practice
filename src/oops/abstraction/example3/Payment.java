//Create an abstract class Payment with fields amount and transactionFee.
//Create an abstract method pay(double amount).
//Create child classes CreditCard, UPI, and NetBanking that calculate transaction fees (2%, 0%, and ₹10 respectively).
//Calculate and display the transaction fee and total amount to be paid.
//Print "Payment Successful" after completing the payment.

package oops.abstraction.example3;

public abstract class Payment {
    public abstract void pay(double amount);
}
class CreditCard extends Payment {
    @Override
    public void pay(double amount) {
        double transactionFee = amount * 0.02;
        double totalAmount = amount + transactionFee;
        System.out.println("Extra transaction fee to pay : " + transactionFee);
        System.out.println("total payment to pay via Credit card  is " + totalAmount);
        System.out.println("---------------------------");
    }
}
class UPI extends Payment {
    @Override
    public void pay(double amount) {
        double transactionFee = amount * 0.0;
        double totalAmount = amount + transactionFee;
        System.out.println("Extra transaction fee to pay : " + transactionFee);
        System.out.println("total payment to pay via UPI is " + totalAmount);
        System.out.println("---------------------------");
    }
}
class NetBanking extends Payment {
    @Override
    public void pay(double amount) {
        double transactionFee = 10;
        double totalAmount = amount + transactionFee;
        System.out.println("Extra transaction fee to pay : " + transactionFee);
        System.out.println("total payment to pay via Net Banking is " + totalAmount);
        System.out.println("---------------------------");
    }
}
