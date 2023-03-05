package core.collectiontest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author long.truong@finos.asia
 */
public class ArrayListTest {

    public static void main(String[] args) {
        System.out.println("start");
        ArrayList<String> strings = new ArrayList<>();

        strings.add("0");
//        strings.add(2,"1");
        strings.add("2");
        strings.add("2");
        strings.add("2");
        strings.add("2");
        strings.add("2");
        System.out.println(strings);
    }
}
