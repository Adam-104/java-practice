package oops.abstraction.example1;

class PizzaOrder extends OrderDetails {

    public PizzaOrder(int orderId, String customerName, String orderName, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderName = orderName;
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("Pizza Order Details");
        System.out.println("---------------------------");
        System.out.println("Pizza Order ID      : " + orderId);
        System.out.println("Pizza Customer Name : " + customerName);
        System.out.println("Pizza Order Name    : " + orderName);
        System.out.println("Pizza Price         : " + price);
        System.out.println("----------------------------");
    }
}

class BurgerOrder extends OrderDetails {

    public  BurgerOrder(int orderId, String customerName, String orderName, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderName = orderName;
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("Burger Order Details");
        System.out.println("---------------------------");
        System.out.println("Burger Order ID        : " + orderId);
        System.out.println("Burger Customer Name   : " + customerName);
        System.out.println("Burger Order Name      : " + orderName);
        System.out.println("Burger Price           : " + price);
        System.out.println("---------------------------");
    }
}

public class Main{
    public static void main(String[] args) {
        BurgerOrder burgerOrder =
                new BurgerOrder(1, "akon", "Cheese Burger", 150);
        burgerOrder.prepareFood();
        burgerOrder.displayDetails();

        PizzaOrder pizzaOrder =
                new PizzaOrder(1, "bkon", "Cheese Pizza", 250);
        pizzaOrder.prepareFood();
        pizzaOrder.displayDetails();
    }
}
