package java1702.javase.basic.collection;

import java.util.LinkedHashMap;

/**
 * Created by whb on
 * 2017/4/12 9:37
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(-1,"bcd");
        map.put(100,"e");
        map.put(null,null);

        System.out.println(map.size());
        System.out.println(map.get(-1));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + ">" + map.get(integer));
        }
    }
}
