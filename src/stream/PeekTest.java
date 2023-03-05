package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author long.truong@finos.asia
 */
public class PeekTest {

    public static void main(String[] args) {
//        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
//        nameStream.peek(System.out::println);

//        Stream.of("one", "two", "three", "four")
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e))
//                .collect(Collectors.toList());

        Stream<User> userStream = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
        userStream.peek(u -> u.setName(u.getName().toLowerCase()))
                .forEach(System.out::println);
        userStream.forEach(System.out::println);
    }


}

 class User{
    public String name;

    public User(String name) {
        this.name = name;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return "User{" +
                 "name='" + name + '\'' +
                 '}';
     }
 }
