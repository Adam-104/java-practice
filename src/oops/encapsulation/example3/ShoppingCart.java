//Java-
// 1.Create a Java class named ShoppingCart using Encapsulation.
//Declare private variables cartItems and totalAmount.
//Implement addItem(), removeItem(), and getTotal() methods.
//Add and remove items by updating the cart details appropriately.
//In the main() method, display the total amount after performing the operations.


//this is a model class

package oops.encapsulation.example3;

public class ShoppingCart {
    private int cartItems;
    private double totalAmount;
    private int totalItems;

    public void addItemToCart(double itemAmount) {
        cartItems++;
        totalAmount += itemAmount;
    }

    public void removeItemFromCart(double itemAmount) {
        cartItems--;
        totalAmount -= itemAmount;
    }

    public void getCartItems() {
        totalItems = cartItems;
        System.out.println("Total items: " + totalItems);
    }

    public void getTotalAmount() {
        System.out.println("Total amount is " + totalAmount);
    }

}
