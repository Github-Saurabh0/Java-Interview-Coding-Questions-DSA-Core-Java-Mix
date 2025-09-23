import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    // Producer method
    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // buffer full → wait
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // notify consumer
    }

    // Consumer method
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // buffer empty → wait
        }
        int val = queue.poll();
        System.out.println("Consumed: " + val);
        notify(); // notify producer
        return val;
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Producer Thread
        Thread producer = new Thread(() -> {
            int value = 1;
            try {
                while (true) {
                    buffer.produce(value++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
