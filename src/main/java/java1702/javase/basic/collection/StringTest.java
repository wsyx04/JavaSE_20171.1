package java1702.javase.basic.collection;

import javax.xml.transform.Source;
import java.security.cert.X509Certificate;
import java.util.Locale;

/**
 * Created by whb on
 * 2017/3/28 10:42
 */
public class StringTest {



    public static void main(String[] args) {
        String s = "hello..";
        String s1 = "haha...";

        char[] chars = {'H','e','l','l','o'};

        String s2 = new String(chars);

        for (char c : s2.toCharArray()) {
            System.out.print(c);
        }
        System.out.println("--------------");

       String s3 = "hello";


       String str = new String(chars);
        System.out.println(str.toLowerCase());
        System.out.println(s3.toUpperCase());

        String s4 = "hahahahaahhahha3";
        String s5 = "hehehe3...";
        System.out.println(s4.charAt(s4.length() - 1));
        System.out.println(s4.codePointAt(s4.length() - 1));
        System.out.println(s4.codePointBefore(s4.length() - 1));
        System.out.println(s4.concat("ssss"));


        }
    }


