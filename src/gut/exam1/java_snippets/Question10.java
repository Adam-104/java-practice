package gut.exam1.java_snippets;

class A{
    int x = 10;
    void show(){
        System.out.println("A " + x);
    }
}
class B extends A{
    int x = 20;
    void show(){
        System.out.println("B " + x);
    }
}
class C extends B{
    int x = 30;
    void show(){
        System.out.println("C " + x);
    }
}

public class Question10 {
    public static void main(String[] args) {
        A a = new C();
        B b = (B) a;
        C c = (C) b;
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(c.x);
        a.show();
        b.show();
        c.show();
    }
}
