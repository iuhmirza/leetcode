package lengthOfLongestSubstring;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        char[] string = s.toCharArray();
        int longest = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < string.length; i++) {
            if (charMap.containsKey(string[i])) {
                if (longest < charMap.size()) {
                    longest = charMap.size();
                }
                i = charMap.get(string[i]);
                charMap.clear();
                continue;
            }
            charMap.put(string[i], i);
        }
        if (longest < charMap.size()) {
            longest = charMap.size();
        }
        return longest;
    }
}










