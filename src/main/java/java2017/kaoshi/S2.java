package java2017.kaoshi;

/**
 * Created by whb on
 * 2017/4/8 14:13
 */
//将一个数组中值为0的项去掉,将不为0的值存入一个新的数组,
public class S2 {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            if ((a[i] - 0) == 0) {
                c++;
            } else {
                int b[] = new int[a.length - c];
                for (int j = 0; j < a.length; j++) {
                    b[j] = a[i];
                }
                System.out.print(b[i] + ",");
            }
        }
    }


}
