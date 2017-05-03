package e;

/**
 * Created by whb on
 * 2017/4/28 9:45
 */
//找出字符串中出现次数最多的字母和出现的次数
public class E2 {
    public static void main(String[] args) {
        String s = "aaadddccdfkkkkkkkkk";
        char c = 0;
        int max = 0 ;
        for (int i = 0; i < s.length(); i++) {
            int n = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {

                    n++;
                }
            }
            if (n  > max) {
                max = n;
                c = s.charAt(i);
            }
        }
        System.out.println(max);
        System.out.println(c);
    }
}
