package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author long.truong@finos.asia
 */
public class S6MoreFeatures {

    public static void main(String[] args) {
        IntStream range = IntStream.range(0, 10);
        IntStream rangeCopied = range;
        range.forEach(System.out::println);

        System.out.println(rangeCopied.sum());

    }
}
