//Java-
//1.Create a Java program using inheritance with a parent class Vehicle and a child class Car.
//Requirements:
//Vehicle should have a variable speed = 50 and a method display().
//Car should have its own variable speed = 100 and override the display() method.
//Create a Car object using a parent-class reference.
//Access the speed variable and call the display() method.
//Predict the output before running the program.
//Explain why the variable and method behave differently.

package oops.inheritance.example3;

class Vehicle{
    int speed = 50;

    void display(){
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle{
    int speed = 100;

    @Override
    void display(){
        System.out.println("This is a Car");
    }
}

public class InheritanceDemo3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        //Car car = new Car();
        System.out.println(vehicle.speed);
        //System.out.println(car.speed);
        vehicle.display();
    }
}
