package isAnagram;

import java.util.HashMap;

public class Solution {
    public static boolean isAnagramWithHashMap(String s, String t) {
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

    public static boolean isAnagram(String s, String t) {
        int[] charCount = new int[26];

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a'] += 1;
            charCount[t.charAt(i) - 'a'] -= 1;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
