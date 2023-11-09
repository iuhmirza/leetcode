package lengthOfLongestSubstring;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (charMap.containsKey(s.charAt(i))) {
                longest = Math.max(longest, charMap.size());
                i = charMap.get(s.charAt(i));
                charMap.clear();
                continue;
            }
            charMap.put(s.charAt(i), i);
        }
        longest = Math.max(longest, charMap.size());
        return longest;
    }
}










