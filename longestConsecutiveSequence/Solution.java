package longestConsecutiveSequence;

import java.util.HashSet;
public class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            set.add(nums[i]);
        }

        int longest = 0;
        int length = 0;
        int index = 0;
        int num;
        while (index < size) {
            num = nums[index];
            while (set.contains(num)) {
                set.remove(num);
                num++;
                length++;
            }

            num = nums[index] - 1;
            while (set.contains(num)) {
                set.remove(num);
                num--;
                length++;
            }

            if (length > longest) {
                longest = length;
            }
            length = 0;
            index++;
        }

        return longest;
    }
}
