package oops.inheritance.example1;

class Vehicle{

    public void start(){
        System.out.println("Vehicle starting");
    }

}

class Car extends Vehicle{

    public void drive(){
        System.out.println("Car driving");
    }

    @Override
    public void start(){
        System.out.println("Car starting");
    }

}

public class InheritanceDemo1 {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.drive();

    }

}
