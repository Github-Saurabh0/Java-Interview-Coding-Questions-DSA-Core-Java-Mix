import java.util.*;

class Solution9 {
    public void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = n - 1, j = 0;

        // Step 1: Swap largest of arr1 with smallest of arr2
        while (i >= 0 && j < m && arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
        }

        // Step 2: Sort both arrays individually
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        sol.merge(arr1, arr2);

        System.out.println("arr1 = " + Arrays.toString(arr1)); // [1,2,3,5,8,9]
        System.out.println("arr2 = " + Arrays.toString(arr2)); // [10,13,15,20]
    }
}
