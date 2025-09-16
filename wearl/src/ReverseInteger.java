public class ReverseInteger {

    public static int reverse(int n) {
        int rev = 0;
        boolean negative = n < 0; // check negative
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            // Check overflow case before multiplying
            if (rev > (Integer.MAX_VALUE - digit) / 10) {
                throw new ArithmeticException("Integer overflow!");
            }
            rev = rev * 10 + digit;
            n /= 10;
        }
        return negative ? -rev : rev;
    }

    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = -987;

        System.out.println("Reverse of " + num1 + " = " + reverse(num1));
        System.out.println("Reverse of " + num2 + " = " + reverse(num2));
    }
}
