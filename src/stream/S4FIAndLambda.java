package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author long.truong@finos.asia
 */
public class S4FIAndLambda {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(42,43,10,11,12,13,14,15,16,17);

        numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        numbers.stream()
                .filter(number -> number%2==0)
                .map(item -> item * item)
                .forEach(System.out::println);
       // test1(numbers);
//        numbers.stream().max(Comparator.comparing(item -> item)).stream().findFirst();
//        System.out.println(max);

//        List<String> courses = List.of("Spring", "Spring  Boot", "API", "Microservices","AWS", "PCF");
//
//        List<String> collect = courses.stream().map(str -> str.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
//        System.out.println(courses);
//        System.out.println(collect);
    }

    private static void test1(List<Integer> numbers) {
        Predicate<Integer> isEvenNumberPredicate = integer -> integer %2==0;
        Function<Integer, Integer> squareNumberFunction = integer -> integer * integer;
        Consumer<Integer> printConsumer = integer -> System.out.println(integer);
        numbers.stream()
                .filter(isEvenNumberPredicate)
                .map(squareNumberFunction)
                .forEach(printConsumer);
    }
}
