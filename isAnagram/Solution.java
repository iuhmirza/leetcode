package isAnagram;

import java.util.HashMap;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch)+1);
            } else {
                charMap.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!charMap.containsKey(ch)) {
                return false;
            }
            int count  = charMap.get(ch) - 1;
            charMap.put(ch, count);
            if (count < 0) {
                return false;
            } else if (count == 0) {
                charMap.remove(ch);
            }
        }

        return charMap.isEmpty();
    }
}
