package java1702.javase.basic.exception;

/**
 * Created by whb on
 * 2017/4/17 9:10
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("hello".charAt(4));
        try {
            System.out.println((new int[]{1, 2, 3})[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
//      e.printStackTrace();
            System.err.println("傻子");
        }finally {
//            System.exit(1);
        }
        System.out.println(1 / 1);
        System.out.println(Integer.valueOf("123"));
        String s = "123";
        s = null;
        System.out.println(s.length());
        System.out.println("完了");

    }
}
