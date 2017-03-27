package java1702.javase.basic.oop;

/**
 * Created by whb on
 * 2017/3/24 11:32
 */
public class PrimitiveTest {

    private String s;

    private static void method(PrimitiveTest primitiveTest) {
        System.out.println("b:" + primitiveTest.s);
        primitiveTest.s = "hi";
        System.out.println("c:" + primitiveTest.s);
    }

    public static void main(String[] args) {
        PrimitiveTest primitiveTest = new PrimitiveTest();
        primitiveTest.s = "hello";
        System.out.println("a:" + primitiveTest.s);
        method(primitiveTest);
        System.out.println("d:" + primitiveTest.s);
    }


}
