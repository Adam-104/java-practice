package gut.exam1.java_snippets;

public class Question1 {
    public static void main(String[] args){
        int x = 4, y= 7, z= 3;
        x += ++y - z--;
        y = x++ + --z - --y;
        z += --x + y++ - ++z;
        System.out.println(x + " " + y + " " + z);
    }
}
