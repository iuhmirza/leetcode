package twoSum;

import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (complement.containsKey(c)) {
                return new int[]{complement.get(c), i};
            }
            complement.put(nums[i], i);
        }
        return new int[2];
    }
}
