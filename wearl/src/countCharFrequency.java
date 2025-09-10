import java.util.*;

class Solution4 {
    public Map<Character, Integer> countCharFrequency(String s) {
        Map<Character, Integer> freq = new LinkedHashMap<>(); // preserve order

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        return freq;
    }

    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.countCharFrequency("programming"));
        System.out.println(sol.countCharFrequency("aabbccc"));
    }
}
