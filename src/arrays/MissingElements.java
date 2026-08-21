package arrays;

public class MissingElements {
    public static void main(String[] args) {
        MissingElements obj = new MissingElements();
        obj.CommonApproach();
        obj.singleArrayApproach();
        obj.twoArraysApproach();
    }

    //this approach is not used for if there are any duplicate array elements
    public void CommonApproach() {
        int[] arr = {1, 3, 5, 6};
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing element : " + missing);
    }

    //using two arrays time complexity : O(n) and space complexity O(n)
    //this approach is not used for unsorted array elements
    public void singleArrayApproach() {
        int[] arr = {1, 3, 5, 6};
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
    //this approach is best approach it is used for unsorted array and also for duplicates also
    public void twoArraysApproach() {
        int[] arr = {3, 3, 2, 5};
        int n = 6;
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }

        System.out.println("Missing elements : ");
        for (int i = 1; i < n; i++) {
            if (!present[i]) {
                System.out.println("Missing element : " + i);
            }
        }
    }
}
