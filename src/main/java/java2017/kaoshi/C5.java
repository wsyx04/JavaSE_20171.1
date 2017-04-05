package java2017.kaoshi;

import java.util.Scanner;

/**
 * Created by whb on
 * 2017/4/1 14:16
 */
public class C5 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("输入字符串:");

        String s = in.nextLine();

        System.out.println("字符串的逆序为:" + '\n' + reverse(s));

        in.close();

    }

    public static String reverse(String s) {

        char[] chars = s.toCharArray();

        int i;

        s = "";

        for (i = chars.length - 1; i >= 0; i--)

            s += chars[i];

        return s;

    }

}


