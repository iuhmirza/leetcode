package twoSumII;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;
        int value;
        while (leftIndex < rightIndex) {
            value = numbers[leftIndex] + numbers[rightIndex];
            if (value == target) {
                return new int[]{leftIndex + 1, rightIndex + 1};
            } else if (value > target) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        return new int[2];
    }
}
