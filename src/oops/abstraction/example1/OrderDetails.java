package oops.abstraction.example1;

public class OrderDetails implements FoodOrder {
    @Override
    public void prepareFood() {
        System.out.println("preparing your order");
    }

    int orderId;
    String customerName;
    String orderName;
    double price;

    public void displayDetails() {
        System.out.println("----------------------");
        System.out.println("Order ID       : " + orderId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Order Name     : " + orderName);
        System.out.println("Price          : " + price);
        System.out.println("---------------------");
    }
}
