package containsDuplicate;

import org.junit.Test;

import static org.junit.Assert.*;

public class testContainsDuplicate {

    @Test
    public void sanityNoDuplicate() {
        int[] array = new int[]{};

        assertFalse(Solution.containsDuplicate(array));
    }

    @Test
    public void sanityDuplicate() {
        int[] array = new int[]{1, 1};

        assertTrue(Solution.containsDuplicate(array));
    }

    @Test
    public void noDuplicate() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};

        assertFalse(Solution.containsDuplicate(array));
    }

    @Test
    public void duplicateInTheMiddle() {
        int[] array = new int[]{1, 2, 3, 4, 4, 5 ,6, 7};

        assertTrue(Solution.containsDuplicate(array));
    }

    @Test
    public void duplicateAtEnd() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 7};

        assertTrue(Solution.containsDuplicate(array));
    }

    @Test
    public void severalDuplicates() {
        int[] array = new int[]{1, 2, 3, 3, 4, 5, 5, 6, 7};

        assertTrue(Solution.containsDuplicate(array));
    }
}
