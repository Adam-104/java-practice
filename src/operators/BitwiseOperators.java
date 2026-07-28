package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("------------------  & ----------------");
        System.out.println(67 & 54); // 2
        System.out.println(89 & 45); // 9
        System.out.println(156 & 89); // 24
        System.out.println(255 & 170); // 170
        System.out.println(345 & 212); // 80

        System.out.println("------------------  | ----------------");
        System.out.println(67 | 54); // 119
        System.out.println(89 | 45); // 125
        System.out.println(156 | 89); // 221
        System.out.println(255 | 170); // 255
        System.out.println(345 | 212); // 477

        System.out.println("------------------ ^ ----------------");
        System.out.println(67 ^ 54); // 117
        System.out.println(89 ^ 45); // 116
        System.out.println(156 ^ 89); // 197
        System.out.println(255 ^ 170); // 85
        System.out.println(345 ^ 212); // 397

        System.out.println("------------------  ~ ----------------");
        System.out.println(~67); // FORMULA : -(n + 1) ex : ~67 = -68
        System.out.println(~89); // -90
        System.out.println(~170); // -171
        System.out.println(~212); // -213


    }
}
