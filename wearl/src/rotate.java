import java.util.*;

class Solution7 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // agar k > n ho toh handle karne ke liye

        reverse(nums, 0, n - 1);       // Step 1: pura array reverse
        reverse(nums, 0, k - 1);       // Step 2: first k elements reverse
        reverse(nums, k, n - 1);       // Step 3: baaki elements reverse
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        sol.rotate(arr, 3);
        System.out.println(Arrays.toString(arr)); // [5, 6, 7, 1, 2, 3, 4]
    }
}
