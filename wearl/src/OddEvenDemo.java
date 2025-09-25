class Printer {
    private int num = 1;
    private final int MAX = 10;
    private boolean oddTurn = true;

    public synchronized void printOdd() throws InterruptedException {
        while (num <= MAX) {
            while (!oddTurn) {
                wait(); // wait until oddTurn is true
            }
            System.out.println("Odd : " + num);
            num++;
            oddTurn = false; // next turn is even
            notify(); // wake up even thread
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (num <= MAX) {
            while (oddTurn) {
                wait(); // wait until oddTurn is false
            }
            System.out.println("Even: " + num);
            num++;
            oddTurn = true; // next turn is odd
            notify(); // wake up odd thread
        }
    }
}

public class OddEvenDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
