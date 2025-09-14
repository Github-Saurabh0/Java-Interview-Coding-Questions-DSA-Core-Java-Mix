class Solution15 {
    // Function to find GCD using Euclidean Algorithm
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Function to find LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // formula: LCM * GCD = a * b
    }

    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        int a = 12, b = 18;

        System.out.println("GCD of " + a + " and " + b + ": " + sol.gcd(a, b)); // 6
        System.out.println("LCM of " + a + " and " + b + ": " + sol.lcm(a, b)); // 36
    }
}
