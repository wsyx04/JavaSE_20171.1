package java1702.javase.basic.collection;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by whb on
 * 2017/4/7 15:06
 */
public class StringText {

    public static void main(String[] args) {
        String s = "hello..";
        String s1 = "hi...";
        System.out.println(s.charAt(0));
        System.out.println(s.concat("he"));
        System.out.println(s.contains("he"));
        System.out.println(s.endsWith("s"));
        System.out.println("test1".equals("test1"));
        System.out.println("test1".equalsIgnoreCase("Test1"));
        System.out.println("test1".indexOf("1"));
        System.out.println("test1".lastIndexOf("1"));
        System.out.println("test1曾思".length());
        System.out.println("test1".replace("st","ts"));
        System.out.println(Arrays.toString("test1".split("1")));
        System.out.println(String.valueOf(new char[]{'t','e','s','t'}));




    }
}
