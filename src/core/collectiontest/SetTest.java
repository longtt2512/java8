package core.collectiontest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author long.truong@finos.asia
 */
public class SetTest {

    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("01st");
        sets.add("02nd");
        sets.add("03rd");
        sets.add("04th");
        System.gc();

//        sets.forEach(System.out::println);
        for (String set : sets) {
            System.out.println(set);
        }

    }
}
