package gut.exam1.java_snippets;

class Parent1{
    void show(Parent1 p){
        System.out.println("Parent-Parent");
    }
}
class Child1 extends Parent1{
    void show(Parent1 p){
        System.out.println("Child-Parent");
    }
    void show(Child1 c){
        System.out.println("Child-Child");
    }
}
public class Question8 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();
        p.show(c);
        c.show(c);
    }
}
