package java2017.kaoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by whb on
 * 2017/4/1 13:46
 */
//2. 从键盘上输入一个字符串，
// 利用字符串类的方法将大写字母转变为小写字母，
// 小写字母转变为大写字母，再将前后字符对换,然后输出最后结果。
public class C2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer strb = new StringBuffer(br.readLine());

        int i;
        for ( i = 0; i < strb.length(); i++) {
            char c = strb.charAt(i);
            if (c <= 'Z' && c >= 'A') {
                strb.setCharAt(i, (char) (c + 32));
            }
            if (c <= 'z' && c >= 'a') {
                strb.setCharAt(i, (char) (c - 32));

            }
            strb.reverse();
            System.out.println(strb);
        }

    }


}
