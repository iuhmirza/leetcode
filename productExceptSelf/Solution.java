package productExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int product = 1;

        int[] arrayOfProducts = new int[size];
        for (int i = 0; i < size; i += 1) {
            arrayOfProducts[i] = product ;
            product *= nums[i];
        }

        product = 1;

        for (int i = size - 1; i > -1; i -= 1) {
            arrayOfProducts[i] *= product;
            product *= nums[i];
        }

        return arrayOfProducts;
    }
}
