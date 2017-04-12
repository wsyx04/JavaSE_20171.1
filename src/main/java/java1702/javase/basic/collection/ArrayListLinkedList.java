package java1702.javase.basic.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by whb on
 * 2017/4/11 15:58
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long m1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(m1);
        for (int i = 0; i < 10000000; i++) {

            linkedList.add(i + "");

        }
        long m2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(m2);
        System.out.println(m2 - m1);
    }

}
