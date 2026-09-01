//this is driver method.

package oops.encapsulation.example3;


public class Shopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItemToCart(5000);
        cart.addItemToCart(2000);
        cart.addItemToCart(3000);
        cart.addItemToCart(4000);
        cart.removeItemFromCart(5000);
        cart.removeItemFromCart(2000);
        cart.getCartItems();
        cart.getTotalAmount();
    }
}

