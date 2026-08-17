//case study 3
//A teacher wants to enter the marks of 10 students.
//WAP to :
//1. Read the marks of 10 students.
//2. Count how many students scored 40 or above.
//3. Count how many students scored below 40.
//4. Find the highest mark.

package casestudiesbyvcube;

import java.util.Scanner;

public class StudentMarksCounter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] studentMarks = new int[10];
        System.out.print("Enter Students Marks : ");
        for (int i = 0; i < studentMarks.length; i++) {
            studentMarks[i] = scanner.nextInt();
        }
        int countOfAbove40 = 0;
        int countOfBelow40 = 0;
        int highestMark = studentMarks[0];

        for (int i = 0; i < studentMarks.length; i++) {
            if(studentMarks[i] >= 40){
                countOfAbove40++;
            }else {
                countOfBelow40++;
            }
            if (studentMarks[i] > highestMark) {
                highestMark = studentMarks[i];
            }
        }
        System.out.println("Number of Students got Above 40 marks : " + countOfAbove40);
        System.out.println("Number of Students got Below 40 marks : " + countOfBelow40);
        System.out.println("Highest Marks Recorded : " + highestMark);
    }
}
