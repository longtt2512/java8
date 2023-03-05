package stream;

import java.util.*;

/**
 * @author long.truong@finos.asia
 */
public class S2StreamExercises {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring  Boot", "API", "Microservices","AWS", "PCF");
        S2StreamExercises exercises = new S2StreamExercises();
        exercises.printAll(courses);
        System.out.println("+++++++++++=++++++++++++++++++++");
        exercises.printAllWithAtleast4Chars(courses);
        System.out.println("+++++++++++=++++++++++++++++++++");
        exercises.printLengthOfCourse(courses);
        // Print square of even number
        System.out.println("+++++++++++=++++++++++++++++++++");
        List<Integer> numbers = List.of(10,11,12,13,14,15,16,17);
        exercises.printSquaresOfEvenNumber(numbers);
    }
    
    public void printAll(List<String> strings){
        strings.stream().filter(s -> s.contains("Spring")).forEach(System.out::println);
    }
    
    public void printAllWithAtleast4Chars(List<String> strings){
        strings.stream().filter(s -> s.length() >3).forEach(System.out::println);

    }

    public void printLengthOfCourse(List<String> courses){
        courses.stream().map(course -> course.length()).forEach(System.out::println);
    }

    public void printSquaresOfEvenNumber(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number %2 == 0)  // lambda expression
                .map(number -> number* number)
                .forEach(System.out::println);
    }
}
