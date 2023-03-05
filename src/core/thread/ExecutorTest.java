package core.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author long.truong@finos.asia
 */
public class ExecutorTest {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Runnable extendingRunnable = new ExtendingRunnable();
        executor.execute(extendingRunnable);
        executor.shutdown();


    }
}
