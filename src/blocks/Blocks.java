package blocks;

public class Blocks{
    //order of execution when there are static and instance blocks and one main method in our program:
    //1st priority: static blocks and static variables go first if there are both static blocks and
    //static variables then jvm serves based on the which one is written first.
    //next priority goes to instance blocks rather than main method only when object reference is created.
    //and then main method is executed
    static {
        System.out.println("This is static block 1");
        Blocks obj1 = new Blocks();
    }
    {
        System.out.println("This is instance block 1");
        // BlocksInJava obj1 = new BlocksInJava();       we cannot create objects for instance blocks in instance block
    }
    public static void main(String[] args){
        System.out.println("This is main method");
        Blocks obj1 = new Blocks();
    }
}

