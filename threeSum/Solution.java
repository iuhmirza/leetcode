package threeSum;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        List<Integer> triplet;
        HashSet<Integer> set;
        Arrays.sort(nums);
        int size = nums.length;
        int i = 0;
        int j;
        int search;
        int target;
        int value;
        while (i < size) {
            target = -nums[i];
            j = i + 1;
            while (j < size) {
                target -= nums[j];
                search = (size - j) / 2 + j;
                while (j < search && search < size) {
                    value = nums[search] + target;
                    if (value > 0) {
                        search = search / 2;
                    } else if (value < 0) {
                        search = (search * 3) / 2;
                    } else {
                        triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[search]);
                        triplets.add(triplet);
                    }
                }
                j++;
            }
            i++;
        }
        return triplets;
    }
}