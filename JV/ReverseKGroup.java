class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseKGroup {

    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        int count = 0;

        // check k nodes
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count == k) {

            ListNode prev = reverseKGroup(curr, k);

            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }

            head = prev;
        }

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // create list: 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Original: ");
        printList(head);

        head = reverseKGroup(head, k);

        System.out.print("After Reverse: ");
        printList(head);
    }
}