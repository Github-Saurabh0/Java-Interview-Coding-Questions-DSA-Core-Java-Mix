class Solution2 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // agar koi mismatch mila, palindrome nahi hai
            }
            left++;
            right--;
        }

        return true; // agar pura loop bina mismatch ke khatam ho gaya
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.isPalindrome("madam")); // true
        System.out.println(sol.isPalindrome("hello")); // false
    }
}
