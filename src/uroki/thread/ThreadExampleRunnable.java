package uroki.thread;

public class ThreadExampleRunnable implements Runnable{

    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Поток был прерван");
        }
        System.out.println(Thread.currentThread().getName() + " stop");
    }
}
