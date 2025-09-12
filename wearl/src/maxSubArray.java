class Solution8 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sol.maxSubArray(arr)); // 6
    }
}
