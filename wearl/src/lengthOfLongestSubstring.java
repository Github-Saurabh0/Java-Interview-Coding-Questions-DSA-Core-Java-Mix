import java.util.*;

class Solution10 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // agar character pehle se map me hai, start ko update karo
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }

            map.put(c, end); // latest index store karo
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // 3
    }
}
