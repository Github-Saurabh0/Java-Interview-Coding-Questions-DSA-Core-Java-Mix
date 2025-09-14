class Solution12 {
    // Iterative Method
    public void printFibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Recursive Method
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Solution12 sol = new Solution12();

        // Iterative output
        sol.printFibonacciIterative(7); // 0 1 1 2 3 5 8

        // Recursive output
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.print(sol.fibonacci(i) + " ");
        }
    }
}
