package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author long.truong@finos.asia
 */
public class S5FunctionalProgramingWithCustomClass {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring  Boot", "API", "Microservices","AWS", "PCF");
//        List<String> collect = courses.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
//        System.out.println(collect);

        System.out.println(courses.stream().findAny().get());

    }
}
