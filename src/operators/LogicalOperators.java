package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 40;

        // In Java logical operators worked on conditions and returns booleans values based on the condition either it 'true' or 'false'

        System.out.println("------------------------");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println("Value of c : " + c);
        System.out.println("------------------------");

        System.out.println("---------------------- && ----------------------");
        System.out.println(a < b && b < c); // true
        System.out.println(c > a && c < b); // false
        System.out.println(a > b && a < b); // (false) in logical && if first condition becomes false it never checks remaining conditions, here a < b consider as dead code
        System.out.println(a == b && a == c); // false

        System.out.println("---------------------- || ----------------------");
        System.out.println(a < b || b < a); // (true) in logical || of first condition becomes true it never checks remaining conditions
        System.out.println(a < c || b > c); // true
        System.out.println(b < a || c > a); // true
        System.out.println(a > b || c < b); // false

        System.out.println("--------------------- ! ----------------");
        System.out.println(!(a < b && b < c)); // false
        System.out.println(!(c > a && c < b)); // true
        System.out.println(!(a < b || c > b)); // false
        System.out.println(!(a < b || b < a)); // false
    }
}
