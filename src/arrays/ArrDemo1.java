package arrays;

import java.util.Arrays;

public class ArrDemo1 {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10, 11, 12, 13};
        int length = 0;
        if (a1.length > a2.length) {
            length = a1.length;
        } else {
            length = a2.length;
        }
        int a3[] = new int[length];

        for (int i = 0; i < a3.length; i++) {
            if (a1.length <= i) {
                a3[i] = a2[i];
            } else if (a2.length <= i) {
                a3[i] = a1[i];
            } else {
                a3[i] = a1[i] + a2[i];
            }
        }
        System.out.println(Arrays.toString(a3));
    }
}
