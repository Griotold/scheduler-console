package stream;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Tomas");
        strList.add("Edward");
        strList.add("Jack");

        Stream<String> stream = strList.stream();
        stream.forEach(s -> System.out.print(s + " "));

        System.out.println();

        strList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
