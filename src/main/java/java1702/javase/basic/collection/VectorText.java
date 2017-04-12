package java1702.javase.basic.collection;

import java.util.Vector;

/**
 * Created by whb on
 * 2017/4/8 10:03
 */
public class VectorText {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>(100);
        for (int i = 0; i <100 ; i++) {
            strings.add("hello");

        }
        strings.add("hi");
        System.out.println(strings.size());
        System.out.println(strings.capacity());
    }
}
