package operators;

public class Swapping {
    public static void main(String[] args){
        //Swapping of two numbers using third variable
        int a = 10;
        int b = 20;

        System.out.println("------------------------");
        System.out.println("before swapping");
        System.out.println("Value of a before swapping : " + a);
        System.out.println("Value of b before swapping : " + b);

        System.out.println("after swapping");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a after swapping : " + a);
        System.out.println("Value of b after swapping : " + b);
        System.out.println("------------------------");

        System.out.println();

        //Swapping of two numbers using without third variable
        System.out.println("------------------------");
        int x = 10;
        int y = 20;
        System.out.println("before swapping");
        System.out.println("Value of x before swapping : " + x);
        System.out.println("Value of y before swapping : " + y);

        System.out.println("after swapping");
        x = x + y; //x becomes 30
        y = x - y; //y = 30 - 20 = 10 (actual x value before swapping)
        x = x- y; //x = 30 - 10 = 20 (actual y value before swapping)

        System.out.println("Value of x after swapping : " + x);
        System.out.println("Value of y after swapping : " + y);
        System.out.println("------------------------");
    }
}
