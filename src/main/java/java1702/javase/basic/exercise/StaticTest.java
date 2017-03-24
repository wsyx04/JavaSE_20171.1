package java1702.javase.basic.exercise;

/**
 * Created by whb on
 * 2017/3/22 9:11
 */
public class StaticTest {
    public static void main(String[] args) {
        ManKind manKind = new ManKind();
        manKind.name = "Tom";
        manKind.age = 16;
        ManKind.isMarried = true;
        System.out.println(manKind.name);
        System.out.println(manKind.age);
        System.out.println(ManKind.isMarried);
        System.out.println("-----------------------------------------------");
        ManKind tom = new ManKind();
        tom.name = "Jerry";
        tom.age = 16;
//        tom.isMarried = true;
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(ManKind.isMarried);
    }
}

class ManKind {
    public String name;
    public int age;
    public static boolean isMarried;

}