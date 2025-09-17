class StackLinkedList {
    private Node top;

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek() {
        if (!isEmpty()) return top.data;
        throw new RuntimeException("Stack is empty");
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(5);
        stack.push(15);
        stack.push(25);

        System.out.println("Top element: " + stack.peek()); // 25
        System.out.println("Removed: " + stack.pop());      // 25
        System.out.println("Now top: " + stack.peek());     // 15
    }
}
