class Solution11 {
    public boolean isPrime(int n) {
        if (n <= 1) return false; // 0 aur 1 prime nahi hote
        if (n == 2 || n == 3) return true; // 2 aur 3 prime hain

        if (n % 2 == 0 || n % 3 == 0) return false; // 2 ya 3 se divisible nahi hona chahiye

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        System.out.println(sol.isPrime(13)); // true
        System.out.println(sol.isPrime(20)); // false
        System.out.println(sol.isPrime(2));  // true
    }
}
