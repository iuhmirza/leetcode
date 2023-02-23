package groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        List<String> firstGroup = new ArrayList<>();
        firstGroup.add(strs[0]);
        groups.add(firstGroup);

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            boolean inGroup = false;
            for (List<String> group : groups) {
                if (isAnagram(group.get(0), str)) {
                    group.add(str);
                    inGroup = true;
                    break;
                }
            }
            if (!inGroup) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                groups.add(newGroup);
            }
        }

        return groups;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCount = new int[26];

        int n = s.length();
        for (int i = 0; i < n; i++) {
            charCount[s.charAt(i) - 'a']++; // have reference char count for each group
            charCount[t.charAt(i) - 'a']--;
        }

        for (int i : charCount) {
            if (i != 0) return false;
        }

        return true;
    }
}
