class Solution13 {
    // Iterative method
    public int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method
    public int factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1; // base case
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();

        // Iterative
        System.out.println("Iterative Factorial of 5: " + sol.factorialIterative(5));

        // Recursive
        System.out.println("Recursive Factorial of 5: " + sol.factorialRecursive(5));
    }
}
