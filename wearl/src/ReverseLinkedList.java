class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse linked list
    public static Node reverse(Node head) {
        Node prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;   // save next node
            curr.next = prev;   // reverse link
            prev = curr;        // move prev forward
            curr = next;        // move curr forward
        }
        return prev; // new head
    }

    // Utility to print list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
