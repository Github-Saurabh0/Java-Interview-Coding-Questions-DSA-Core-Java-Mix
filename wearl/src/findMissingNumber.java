class Solution5 {
    public int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; // formula sum of 1 to N
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        return totalSum - arraySum; // difference hi missing number hoga
    }

    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] arr1 = {1, 2, 4, 5};
        System.out.println(sol.findMissingNumber(arr1, 5)); // 3

        int[] arr2 = {2, 3, 1, 5};
        System.out.println(sol.findMissingNumber(arr2, 5)); // 4
    }
}
