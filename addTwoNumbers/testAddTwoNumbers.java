package addTwoNumbers;

import org.junit.Test;
import static org.junit.Assert.*;

public class testAddTwoNumbers {

    @Test
    public void sanityZeroListsTest() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(0, result.val);
        assertNull(result.next);
    }

    @Test
    public void sanityOneListsTest() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(2, result.val);
        assertNull(result.next);
    }

    @Test
    public void shortListsTest() {
        ListNode l1 = ListNode.arrayToList(new int[]{0, 0, 0, 1});
        ListNode l2 = ListNode.arrayToList(new int[]{4, 3, 2, 1});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertTrue(ListNode.equals(result, ListNode.arrayToList(new int[]{4, 3, 2, 2})));
    }

    @Test
    public void differingSizeListsTest() {
        ListNode l1 = ListNode.arrayToList(new int[]{3, 2, 1});
        ListNode l2 = ListNode.arrayToList(new int[]{4, 3, 2, 1});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertTrue(ListNode.equals(result, ListNode.arrayToList(new int[]{7, 5, 3, 1})));
    }

    @Test
    public void sanityCarryTest() {
        ListNode l1 = ListNode.arrayToList(new int[]{9});
        ListNode l2 = ListNode.arrayToList(new int[]{9});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertTrue(ListNode.equals(result, ListNode.arrayToList(new int[]{8, 1})));
    }

    @Test
    public void carryTest() {
        ListNode l1 = ListNode.arrayToList(new int[]{4, 5, 6, 3});
        ListNode l2 = ListNode.arrayToList(new int[]{3, 5, 2, 1});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertTrue(ListNode.equals(result, ListNode.arrayToList(new int[]{7, 0, 9, 4})));
    }

    @Test
    public void insanityCarryTest() {
        ListNode l1 = ListNode.arrayToList(new int[]{9, 9, 9, 9});
        ListNode l2 = ListNode.arrayToList(new int[]{9, 9, 9, 9, 9, 9});

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertTrue(ListNode.equals(result, ListNode.arrayToList(new int[]{8, 9, 9, 9, 0, 0, 1})));
    }
}
