package stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author long.truong@finos.asia
 */
public class S3PlayingWithStream {

    public static void main(String[] args) {
        System.out.println("Get sum of list integer");
        S3PlayingWithStream s3PlayingWithStream = new S3PlayingWithStream();
        List<Integer> integers = List.of(1, 2, 3,9,11);
//        int sum = s3PlayingWithStream.addList(integers);
//        System.out.println(sum);
//        System.out.println("==================================");
//        List<String> courses = List.of("Spring", "Spring  Boot", "API", "Microservices", "AWS", "PCF");
//        System.out.println(s3PlayingWithStream.concatenateStrings(courses));
        System.out.println("==================================");
        s3PlayingWithStream.sumOfSquaredNumbersInList(integers);
        System.out.println("==================================");
        s3PlayingWithStream.sumOfOddNumbers(integers);
    }

    private int addList(List<Integer> integers) {

        return integers.stream().reduce(0, Integer::sum);

    }

    private String concatenateStrings(List<String> strings) {
        return strings.stream().reduce("", (s1, s2) -> s1 + s2);
    }

    public void sumOfSquaredNumbersInList(List<Integer> integers) {
        int sum = integers.stream().map(number -> number * number).reduce(Integer::sum).get();
        System.out.println(sum);
    }

    public void sumOfOddNumbers(List<Integer> integers){
        System.out.println(integers.stream().filter(item-> item%2 !=0).reduce((a,b)->Integer.sum(a,b)).get());
    }
}
