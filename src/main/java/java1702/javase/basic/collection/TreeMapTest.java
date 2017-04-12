package java1702.javase.basic.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by whb on
 * 2017/4/12 10:00
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("bcd", -1);
        map.put("bcde", 100);
//        map.put(null,1);

        System.out.println(map.size());
        System.out.println(map.get("e"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ">" + entry.getValue());
        }
    }
}

