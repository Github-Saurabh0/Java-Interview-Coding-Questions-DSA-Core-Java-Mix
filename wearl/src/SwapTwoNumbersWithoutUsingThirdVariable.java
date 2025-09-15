class Solution16 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap without temp variable
        a = a + b;  // a = 15
        b = a - b;  // b = 5
        a = a - b;  // a = 10

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
