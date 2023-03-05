package core.thread;

/**
 * @author long.truong@finos.asia
 */
public class ThreadTest extends Thread{

    @Override
    public void run() {
        System.out.println("Current thread "+ Thread.currentThread().getName()+ " is running");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadTest threadTest = new ThreadTest();
            threadTest.start();
        }
    }
}
