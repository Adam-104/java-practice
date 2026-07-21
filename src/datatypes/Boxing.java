package datatypes;

public class Boxing {
    //AutoBoxing
    //auto boxing is known as automatically converting from primitive data type to object of their respective wrapper classes
    Integer a = 10;
    //unboxing
    //auto-unboxing is known as converting wrapper class object to its primitive data type
    int a1 = a;

    //to convert numeric string to integer values we use Integer.parseInt()
    String s = "1234";
    int a3 = Integer.parseInt(s);
    float a4 = Float.parseFloat(s);
    double a5 = Double.parseDouble(s);
    public static void main(String[] args) {
        Boxing boxing = new Boxing();
        System.out.println("value of a: " + boxing.a);
        System.out.println("value of a1: " + boxing.a1);
        System.out.println("value of a3: " + boxing.a3);
        System.out.println("value of a4: " + boxing.a4);
        System.out.println("value of a5: " + boxing.a5);

    }
}
