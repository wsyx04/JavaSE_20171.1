package java1702.javase.basic.oop;

/**
 * Created by whb on
 * 2017/3/24 11:32
 */
public class PrimitiveTest {
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
