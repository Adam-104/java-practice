//1.Create an interface FoodOrder with prepareFood().
//Create a base class OrderDetails with orderId, customerName, price, and displayDetails().
//Create PizzaOrder and BurgerOrder classes that extend OrderDetails and implement FoodOrder.
//Override prepareFood() in both classes and demonstrate runtime polymorphism in main().


package oops.abstraction.example1;

public interface FoodOrder {
    public void  prepareFood();
}
