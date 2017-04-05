package java1702.javase.basic.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by whb on
 * 2017/3/31 11:46
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hello");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains("hello"));
        System.out.println(arrayList.indexOf("hello"));
        System.out.println(arrayList.lastIndexOf("hello"));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.set(0, "test"));
        Object[] objects = arrayList.toArray();
        arrayList.add("hello");
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        ArrayList<String> strings = new ArrayList<>();
//        strings.add("test");
//        strings.add("hello");
        arrayList.removeAll(strings);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        List<String> strings1 = arrayList.subList(0,1);
        System.out.println(strings1);






    }
}
