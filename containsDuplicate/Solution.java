package containsDuplicate;

import java.util.HashSet;
public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (intSet.contains(nums[i])) {
                return true;
            }
            intSet.add(nums[i]);
        }
        return false;
    }
}
