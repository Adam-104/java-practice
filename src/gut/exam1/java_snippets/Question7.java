package gut.exam1.java_snippets;

class Parent{
    int x = 10;
    Parent(){
        show();
    }
    void show(){
        System.out.println("Parent" + x);
    }
}
class Child extends Parent{
    int x = 20;
    Child(){
        show();
    }
    void show(){
        System.out.println("Child" + x);
    }
}

public class Question7 {
    public static void main(String[] args) {
        new Child();
    }
}
