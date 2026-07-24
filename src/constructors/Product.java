package constructors;


public class Product {
    String ProductName;
    double price;
    int quantity;

    Product(){
        this("Asus vivoBook");
    }

    Product(String name){
        this(name, 75000);
    }

    Product(String name, double price){
        this(name, price, 2);
    }

    Product(String name, double price, int quantity){
        this.ProductName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalPrice(){
        return this.quantity * this.price;
    }

    public void productInfo(){
        System.out.println("Product Details");
        System.out.println("---------------------------");
        System.out.println("Product Name       : " + ProductName);
        System.out.println("Product Price      : " + price);
        System.out.println("Product Quantity   : " + quantity);
        System.out.println("Total Price        : " + totalPrice());
        System.out.println("---------------------------");
    }

    public static void main(String[] args){
        Product product1 = new Product();
        product1.productInfo();

        Product product2 = new Product("Lenovo yogaPad", 100000);
        product2.productInfo();

        Product product3 = new Product("MacBook", 150000, 3);
        product3.productInfo();
    }
}
