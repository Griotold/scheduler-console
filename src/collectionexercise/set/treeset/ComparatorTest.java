package collectionexercise.set.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    /**
     * 내림차순 정렬
     * */
    @Override
    public int compare(String o1, String o2) {
        return (o1.compareTo(o2)) * -1;
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new MyCompare());
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);
    }
}
