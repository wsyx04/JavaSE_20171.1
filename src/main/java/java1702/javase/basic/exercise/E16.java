package java1702.javase.basic.exercise;

/**
 * Created by whb on
 * 2017/3/21 15:06
 */
public class E16 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.println(i + "*" + j+ "=" + i * j);
                System.out.println("-----------");
            }
        }
    }

}
