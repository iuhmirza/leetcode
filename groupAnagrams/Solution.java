package groupAnagrams;

import java.util.*;

public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            int[] charCount = new int[26];

            int n = str.length();
            for (int i = 0; i < n; i++) {
                charCount[str.charAt(i) - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < 26; i ++) {
                sb.append(charCount[i]);
                sb.append(",");
            }

            String repr = sb.toString();

            if (!anagramMap.containsKey(repr)) {
                anagramMap.put(repr, new ArrayList<>());
            }
            anagramMap.get(repr).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
