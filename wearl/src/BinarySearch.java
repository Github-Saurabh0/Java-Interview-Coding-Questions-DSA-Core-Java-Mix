public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // safe from overflow

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                left = mid + 1; // move right
            } else {
                right = mid - 1; // move left
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int index = binarySearch(arr, target);
        System.out.println("Target found at index: " + index); // 3
    }
}
