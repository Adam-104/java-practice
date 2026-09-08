package gut.exam1.java_snippets;

public class Question3 {
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 20};
        int i = 3;
        a[i]--;
        a[--i]++;
        a[i--] = --a[i];
        System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
    }
}
