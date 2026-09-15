//1.Create an abstract class Shape.
//Add an abstract method area().
//Create Circle, Rectangle, and Triangle subclasses.
//Override area() in each class.

package oops.abstraction.example2;

abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double height;
    double breadth;

    Triangle(double height, double breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return 1 / 2 * height * breadth;
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(5, 10);

        System.out.println("Area of Circle : " + circle.area());
        System.out.println("Area of Circle : " + rectangle.area());
        System.out.println("Area of Circle : " + triangle.area());
    }
}

