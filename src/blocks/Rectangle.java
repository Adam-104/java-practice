package blocks;

public class Rectangle {
    public void rectangle(){
        int length = 10;
        int width =5;
        System.out.println("The area of the rectangle is: " + length*width);
        System.out.println("the perimeter of the rectangle is: " + 2 * (length + width));
    }
    public static void main(String[] args) {
        Rectangle areawidth = new Rectangle();
        areawidth.rectangle();
    }
}
