class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class MiddleOfLinkedList {
    public static ListNode findMiddle(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Fast moves 2 steps, slow moves 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow will be at middle
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode mid = findMiddle(head);
        System.out.println("Middle Element: " + mid.val);
    }
}
