package java2017.kaoshi;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by whb on
 * 2017/4/1 16:24
 */
public class C3 {
    public static void main(String[] args) {
        String content = "aababcabcdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        char[] chs = content.toCharArray();

        for (char ch : chs) {
            Integer i = tm.get(ch);

            if (i == null) {
                tm.put(ch, 1);
            } else {
                i++;
                tm.put(ch, i);
            }
        }

        StringBuilder sb = new StringBuilder();


        Set<Character> set = tm.keySet();
        for (Character key : set) {
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }


        String result = sb.toString();
        System.out.println("result:" + result);
    }
}
