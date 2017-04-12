package java2017.kaoshi;

import java1702.javase.basic.exercise.E8;

/**
 * Created by whb on
 * 2017/3/25 9:43
 */
public class E86 {

    public static void method(int x) {
        System.out.println("b:" + x);
        x++;
        System.out.println("c:" + x);
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a:" + i);
        method(i);
        System.out.println("d:" + i);
    }


}

class E88 {


    public static void method(boolean x) {
        System.out.println("b" + x);
        x = false;
        System.out.println("c" + x);
    }

    public static void main(String[] args) {

        boolean x = true;
        System.out.println("a" + x);
        method(x);
        System.out.println("d" + x);
    }
}