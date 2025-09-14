class Solution14 {
    public boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length(); // kitne digits hain
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits); // har digit ka power add karo
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        System.out.println(sol.isArmstrong(153)); // true
        System.out.println(sol.isArmstrong(123)); // false
        System.out.println(sol.isArmstrong(9474)); // true
    }
}
