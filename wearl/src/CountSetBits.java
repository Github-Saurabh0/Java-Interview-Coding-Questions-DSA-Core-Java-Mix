public class CountSetBits {

    // Method 1: Normal way
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) { // check last bit
                count++;
            }
            n >>= 1; // right shift
        }
        return count;
    }

    // Method 2: Brian Kernighan’s Algorithm (fastest)
    public static int countSetBitsOptimized(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // remove the last set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 29; // binary: 11101
        System.out.println("Normal Count: " + countSetBits(num));
        System.out.println("Optimized Count: " + countSetBitsOptimized(num));
    }
}
