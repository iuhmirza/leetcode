class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

public class Solution {
    public static void reorderList(ListNode head) {
        if (head.next == null) return;
        ListNode head2 = head.next;

        ListNode curr = head;
        ListNode next;
        while (curr.next != null) {
            next = curr.next;
            curr.next = next.next;
            curr = next;
        }

        ListNode prev = null;
        curr = head2;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head2 = prev;

        prev = head;
        curr = head2;
        while (curr != null) {
            next = prev.next;

            prev.next = curr;
            head2 = curr.next;
            curr.next = next;
            prev = next;
            curr = head2;
        }
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(10, new ListNode(20, new ListNode(30, new ListNode(40, new ListNode(50)))));
        removeNthFromEnd(n, 2);
        print(n);
    }

    public static void print(ListNode N) {
        ListNode curr = N;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) return head.next;
        int i = 0;
        ListNode prev = null;
        ListNode curr = head;
        while (i < n) {
            prev = curr;
            curr = curr.next;
            i++;
            System.out.println(curr.val);
            System.out.println(i);
        }
        prev.next = curr.next;
        return head;
    }
}
