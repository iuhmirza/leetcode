package addTwoNumbers;

public class addTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode curr = sum;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int total = l1.val + l2.val + carry;
            if (total > 9) {
                carry = 1;
                total -= 10;
            } else {
                carry = 0;
            }
            curr.next = new ListNode(total);
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode remainder;
        if (l1 != null) {
            remainder = l1;
        } else {
            remainder = l2;
        }

        while (remainder != null) {
            int total = remainder.val + carry;
            if (total > 9) {
                total -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            curr.next = new ListNode(total);
            curr = curr.next;
            remainder = remainder.next;
        }

        if (carry == 1) {
            curr.next = new ListNode(carry);
        }
        return sum.next;
    }
}
