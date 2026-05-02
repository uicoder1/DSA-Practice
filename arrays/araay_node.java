class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class araay_node {

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode a = prev.next;
            ListNode b = prev.next.next;

            a.next = b.next;
            b.next = a;
            prev.next = b;

            prev = a;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode res = swapPairs(head);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        // Output: 2 1 4 3
    }
}