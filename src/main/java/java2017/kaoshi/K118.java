package java2017.kaoshi;


import java.util.Arrays;

/**
 * Created by whb on
 * 2017/4/15 9:18
 */
public class K118 {
    public static void main(String[] args) {
        String s0 = "123,45,25,85";
        String[] str1 = s0.split(",");


        int[] num = new int[str1.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(str1[i]);

        }
        Arrays.sort(num);

        for (int j = 0; j < num.length; j++) {
//            System.out.print(num[j]);
            System.out.print(Arrays.toString(new int[]{num[j]}));
        }
    }


}
