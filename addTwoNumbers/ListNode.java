package addTwoNumbers;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode arrayToList(int[] array) {
        ListNode l = new ListNode();
        ListNode current = l;
        for (int i = 0; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return l.next;
    }

    public static boolean equals(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == l2;
    }

}












