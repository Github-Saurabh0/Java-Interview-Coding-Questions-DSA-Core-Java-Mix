import java.util.*;

class LRUCache {
    class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k; value = v;
        }
    }

    private final int capacity;
    private Map<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        // Dummy head & tail to simplify add/remove
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);
        insertToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev); // remove LRU
        }
        Node newNode = new Node(key, value);
        insertToFront(newNode);
        map.put(key, newNode);
    }

    // Remove node from DLL
    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Insert node right after head (MRU position)
    private void insertToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    // Just for testing
    public void printCache() {
        Node cur = head.next;
        while (cur != tail) {
            System.out.print("[" + cur.key + ":" + cur.value + "] ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.printCache(); // [2:2] [1:1]

        System.out.println(cache.get(1)); // 1
        cache.printCache(); // [1:1] [2:2]

        cache.put(3, 3); // evicts key 2
        cache.printCache(); // [3:3] [1:1]

        System.out.println(cache.get(2)); // -1
    }
}
