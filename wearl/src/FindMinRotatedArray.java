public class FindMinRotatedArray {
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum right side me hoga
                left = mid + 1;
            } else {
                // Minimum mid ya left side me hoga
                right = mid;
            }
        }
        return nums[left]; // ya nums[right]
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println("Minimum element: " + findMin(arr));
    }
}
