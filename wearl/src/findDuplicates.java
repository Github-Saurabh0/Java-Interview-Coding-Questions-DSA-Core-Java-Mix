import java.util.*;

class Solution6 {
    public Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num); // agar pehle se seen hai toh duplicate hai
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int[] arr1 = {1, 2, 3, 2, 4, 5, 1};
        System.out.println(sol.findDuplicates(arr1)); // [1, 2]

        int[] arr2 = {10, 20, 30, 40};
        System.out.println(sol.findDuplicates(arr2)); // []
    }
}
