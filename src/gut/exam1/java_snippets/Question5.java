package gut.exam1.java_snippets;

public class Question5 {
    public static void main(String[] args) {
        Question5 q5 = null;
        for (int i = 0; i < 5; i++) {
            q5 = new Question5();
        }
        System.gc();
        System.out.println("Done");
    }
}
