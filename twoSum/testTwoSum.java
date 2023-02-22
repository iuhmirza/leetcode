package twoSum;

import org.junit.*;
import static org.junit.Assert.assertArrayEquals;
public class testTwoSum {
    @Test
    public void sanityFailTest() {
        int[] testArray = new int[]{1, 2, 3, 4};
        int target = 10;
        int[] expected = new int[]{0, 0};

        assertArrayEquals(expected, twoSum.twoSum(testArray, target));
    }

    @Test
    public void sanityPassTest() {
        int[] testArray = new int[]{1, 2, 3, 4};
        int target = 5;
        int[] expected = new int[]{1, 2};

        assertArrayEquals(expected, twoSum.twoSum(testArray, target));
    }

    @Test
    public void longPassTest() {
        int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        int[] expected = new int[]{3, 5};

        assertArrayEquals(expected, twoSum.twoSum(testArray, target));
    }
}
