public class RotatedSortedArraySearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // search left
                } else {
                    left = mid + 1; // search right
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // search right
                } else {
                    right = mid - 1; // search left
                }
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Index of target: " + search(arr, target)); // 4
    }
}
