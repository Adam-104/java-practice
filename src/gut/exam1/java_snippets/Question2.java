package gut.exam1.java_snippets;

public class Question2 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8};
        int i = 0;
        a[i]++;
        ++a[i++];
        a[i] += a[i - 1]++;
        System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
    }
}
