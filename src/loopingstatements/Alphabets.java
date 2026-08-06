package loopingstatements;

import java.util.Scanner;

public class Alphabets {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print((char)i + " ");
        }
    }
}
