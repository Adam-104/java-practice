package gut.exam1.java_snippets;

class Parent2{}
class Child2 extends Parent2{}

public class Question9 {
    static void show(Object o){
        System.out.println("Object");
    }
    static void show(Parent2 p){
        System.out.println("Parent");
    }
    static void show(Child2 c){
        System.out.println("Child");
    }
    public static void main(String[] args) {
        Object o = new Child2();
        show(o);
    }
}
