package java2017.kaoshi;

/**
 * Created by whb on
 * 2017/3/25 9:43
 */
public class E86{

    public static void method(int i) {
        System.out.println("b:" + i);
        i++;
        System.out.println("c:" + i);
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a:" + i);
        method(i);
        System.out.println("d:" + i);
    }



}
