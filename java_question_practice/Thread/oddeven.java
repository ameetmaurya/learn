package Thread;

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers from 1 to 50:");
        int count = 0;

        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
            count++;

            // Sleep after every 3 even numbers
            if (count % 3 == 0) {
                try {
                    Thread.sleep(500);  // sleep for 500ms
                } catch (InterruptedException e) {
                    System.out.println("Even thread interrupted");
                }
            }
        }
        System.out.println();  // for spacing
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers from 1 to 50:");
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class oddeven {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();
    }
}
