package java1702.javase.basic.collection;

import java.awt.datatransfer.StringSelection;
import java.util.LinkedList;

/**
 * Created by whb on
 * 2017/4/11 9:51
 */
public class LinkedListTest {
    public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        System.out.println(strings.size());
        System.out.println(strings.get(0));

        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());


    }


}
