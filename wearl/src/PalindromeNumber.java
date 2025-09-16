public class PalindromeNumber {

    public static boolean isPalindrome(int n) {
        if (n < 0) return false; // negative number is not palindrome

        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            if (rev > (Integer.MAX_VALUE - digit) / 10) {
                return false; // overflow check
            }
            rev = rev * 10 + digit;
            n /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 123;
        int num3 = -121;

        System.out.println(num1 + " is Palindrome? " + isPalindrome(num1));
        System.out.println(num2 + " is Palindrome? " + isPalindrome(num2));
        System.out.println(num3 + " is Palindrome? " + isPalindrome(num3));
    }
}
