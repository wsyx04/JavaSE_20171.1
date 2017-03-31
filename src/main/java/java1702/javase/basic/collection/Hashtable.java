package java1702.javase.basic.collection;

import java.util.Map;

/**
 * Created by whb on
 * 2017/3/29 15:18
 */
public class Hashtable {
    public static void main(String[] args) {
        java.util.Hashtable<Integer,String> hashtable = new java.util.Hashtable<>();
        hashtable.put(1,"hi");
        hashtable.put(2,"hello");
        hashtable.put(3,"hello");
        System.out.println("size:" + hashtable.size());
        System.out.println( hashtable.get(5));
        System.out.println(hashtable.contains("hi"));

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "->" + hashtable.get(integer));
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "->" + integerStringEntry.getValue());
        }

    }


}
