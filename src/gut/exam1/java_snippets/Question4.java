package gut.exam1.java_snippets;

public class Question4 {
    static void test(){
        Question4 q = new Question4();
        Question4 q1 = new Question4();
        q = q1;
    }
    public static void main(String[] args) {
        test();
        System.gc();
        System.out.println("Done");
    }
}
