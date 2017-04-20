package java2017.kaoshi;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by whb on
 * 2017/4/15 8:50
 */
public class K116 {
    public static void main(String[] args) {
    String s1 = "1,3,5";
    int len1 = 3;
    String s2 = "2,4,1,7,5";
    int len2 = 5;
    int diffNum = getDiffNum(s1, len1, s2, len2);
        System.out.println(diffNum);

    }
    public static int getDiffNum(String s1, int len1, String s2, int len2) {
        String[] str1 = s1.split(",");
        String[] str2 = s2.split(",");
        int len = len1 > len2 ? len2 : len1;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (!str1[len1 - 1 - i].equals(str2[len2 - 1 - i]))
                count++;
        }

        return count;

    }
}