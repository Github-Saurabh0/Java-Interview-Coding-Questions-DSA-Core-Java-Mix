class QueueLinkedList {
    private Node front, rear;

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }

    public int peek() {
        if (!isEmpty()) return front.data;
        throw new RuntimeException("Queue is empty");
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);

        System.out.println("Front element: " + q.peek()); // 5
        System.out.println("Removed: " + q.dequeue());    // 5
        System.out.println("Now front: " + q.peek());     // 15
    }
}
