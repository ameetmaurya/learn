package Thread;

class AscendingThread extends Thread {
    public void run() {
        System.out.println("Ascending Thread:");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(50); // optional delay
            } catch (InterruptedException e) {
                System.out.println("Ascending thread interrupted");
            }
        }
        System.out.println(); // newline
    }
}

class DescendingThread extends Thread {
    public void run() {
        System.out.println("Descending Thread:");
        for (int i = 50; i >= 1; i--) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000); // optional delay
            } catch (InterruptedException e) {
                System.out.println("Descending thread interrupted");
            }
        }
        System.out.println(); // newline
    }
}

public class prac1 {
    public static void main(String[] args) {
        AscendingThread asc = new AscendingThread();
        DescendingThread desc = new DescendingThread();

        asc.start();
        desc.start();
    }
}
