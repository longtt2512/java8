package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author long.truong@finos.asia
 */
public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1,4,6,32,7,3);

        List<Integer> collect1 = integers.stream().map(item -> item * 2).collect(Collectors.toList());
        System.out.println(collect1);
        List<String> strings = List.of("a1", "b2", "c3","d4");
        List<String> collect2 = strings.stream().flatMap(str -> Stream.of(str.substring(0, 1))).collect(Collectors.toList());
        System.out.println(collect2);

        Stream<String> sdsad = Stream.of("121", "sdsad");

    }
}
