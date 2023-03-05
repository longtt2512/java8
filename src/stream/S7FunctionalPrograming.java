package stream;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

/**
 * @author long.truong@finos.asia
 */
public class S7FunctionalPrograming {

    public static void main(String[] args) {
        // Parallelize
//        Instant start = Instant.now();
//        System.out.println(LongStream.range(1,900_000_000).sum());
//        Instant stop1 = Instant.now();
//        System.out.println(Duration.between(start,stop1).toMillis()+"ms");
        Instant start2 = Instant.now();
        System.out.println( LongStream.range(1,900_000_000).peek(System.out::println).parallel().peek(System.out::println).sum());
        Instant stop2 = Instant.now();
        System.out.println(Duration.between(start2,stop2).toMillis()+"ms");
    }
}
