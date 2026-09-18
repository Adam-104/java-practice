package oops.abstraction.example3;

public class TransactionFee {
    public static void main(String[] args) {
        Payment creditCard = new CreditCard();
        creditCard.pay(500);

        Payment upi = new UPI();
        upi.pay(500);

        Payment netBanking = new NetBanking();
        netBanking.pay(500);
    }
}
