package java1702.javase.basic.collection;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by whb on
 * 2017/4/12 11:34
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        ListIterator<String> listIterator = strings.listIterator();
        //next
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println(next);
        }
        System.out.println("------");
        while (listIterator.hasPrevious()) {
            String prev = listIterator.next();
            System.out.println(prev);
        }
    }
}
