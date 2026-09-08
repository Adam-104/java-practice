package gut.exam1.java_snippets;

public class Question6 {
    public static void main(String[] args) {
        Question6 x = new Question6();
        Question6 y = x;
        Question6 z = y;
        x = null;
        y = null;
        System.gc();
        System.out.println("Done");
    }
}
