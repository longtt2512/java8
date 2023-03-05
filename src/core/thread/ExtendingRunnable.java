package core.thread;

import java.util.Random;

/**
 * @author long.truong@finos.asia
 */
public class ExtendingRunnable implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread() + " is running");
            Thread.sleep(new Random().nextInt(10_000-1_000)+ 1_000);
            System.out.println(Thread.currentThread() + " is waking-up");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
           Thread localThread = new Thread(new ExtendingRunnable());

            localThread.start();
        }
    }
}
