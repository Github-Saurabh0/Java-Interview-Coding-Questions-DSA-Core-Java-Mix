import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If stack empty, no greater element
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            // Push current element
            stack.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] ans = nextGreater(arr);
        System.out.println(Arrays.toString(ans)); // [5, 25, 25, -1]
    }
}
