package lengthOfLongestSubstring;

import java.util.HashSet;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        char[] string = s.toCharArray();
        HashSet<Character> charSet = new HashSet<>();
        int longest = 0;
        for (int i = 0; i < string.length; i++) {
            if (charSet.contains(string[i])) {
                if (longest < charSet.size()) {
                    longest = charSet.size();
                }
                charSet.clear();
            }
            charSet.add(string[i]);
        }
        if (longest < charSet.size()) {
            longest = charSet.size();
        }
        return longest;
    }
}
