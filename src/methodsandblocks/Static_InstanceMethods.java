package methodsandblocks;

public class Static_InstanceMethods {
    static Static_InstanceMethods obj = new Static_InstanceMethods();

    public static void main(String[] args){
        System.out.println("This is main method");
        method1();
    }
    static void method1(){
        method2();
        System.out.println("This is method1");
    }
    static void method2(){
        obj.method4();
        method3();
        System.out.println("This is method2");
    }
    static void method3(){
        System.out.println("This is method3");
    }
    void method4(){
        method5();
        System.out.println("This is method4");
    }
    void method5(){
        System.out.println("This is method5");
    }
}
