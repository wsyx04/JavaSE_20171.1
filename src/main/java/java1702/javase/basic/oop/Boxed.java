package java1702.javase.basic.oop;

/**
 * Created by whb on
 * 2017/3/27 9:51
 */
public class Boxed {
    private Boolean i;
    private static void method(Boxed test) {
        System.out.println("b:" + test.i);
        test.i = true;
        System.out.println("c:" + test.i);


    }

    public static void main(String[] args) {
        Boxed boxed = new Boxed();
        boxed.i = false;
        System.out.println("a:" + boxed.i);
        method(boxed);
        System.out.println("a:" + boxed.i);
    }
}
