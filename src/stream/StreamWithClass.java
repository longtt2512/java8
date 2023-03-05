package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author long.truong@finos.asia
 */
public class StreamWithClass {

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("aa", 1),
                new Student("aa1", 2),
                new Student("aa2", 3),
                new Student("aa2", 4),
                new Student("aa4", 5),
                new Student("aa4", 5)
        );
        System.out.println(
        studentList.stream().collect(Collectors.groupingBy(Student::getName)));

    }
}
