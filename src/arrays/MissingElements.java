package arrays;

public class MissingMultipleElements {
    public static void main(String[] args) {
        MissingMultipleElements obj = new MissingMultipleElements();
        obj.CommonApproach();
        obj.singleArrayApproach();
        obj.twoArraysApproach();
    }

    public void singleArrayApproach() {
        int[] arr = {1, 2, 4, 6};
        int expected = 1;
        for (int i = 1; i < arr.length; i++) {
            while (expected < arr[i]) {
                System.out.println("Missing element : " + expected);
                expected++;
            }
            expected++;
        }
    }

    //using two arrays time complexity : O(n) and space complexity O(n)
    public void twoArraysApproach() {
        int[] arr = {1, 2, 4, 6};
        int n = 6;
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }

        System.out.println("Missing elements : ");
        for (int i = 0; i < n; i++) {
            if (!present[i]) {
                System.out.println("Missing element : " + i);
            }
        }
    }
}
