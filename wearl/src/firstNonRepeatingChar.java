import java.util.*;

class Solution3 {
    public char firstNonRepeatingChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of each char
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Traverse again to find first char with freq == 1
        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }

        return '-'; // agar koi non-repeating character nahi mila
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.firstNonRepeatingChar("swiss"));   // w
        System.out.println(sol.firstNonRepeatingChar("aabbcc")); // -
    }
}
