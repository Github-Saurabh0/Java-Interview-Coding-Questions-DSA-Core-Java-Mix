public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak lies in left including mid
                right = mid;
            } else {
                // Peak lies in right
                left = mid + 1;
            }
        }
        return left; // or right (both same at the end)
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println("Peak index: " + findPeakElement(arr));
    }
}
