import java.util.HashSet;

class DetectCycleHashSet {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head) {
        HashSet<Node> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) return true;
            visited.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // create cycle: 30 -> 20
        head.next.next.next = head.next;

        System.out.println("Cycle present? " + hasCycle(head)); // true
    }
}
