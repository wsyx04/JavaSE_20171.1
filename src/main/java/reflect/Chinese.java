package reflect;


import java1702.javase.basic.basic.Human;


/**
 * Created by whb on
 * 2017/5/3 16:50
 */
public class Chinese extends Human {
    private int i;

    public Chinese(boolean isWorked, int weight, char gender, int age, int i) {
        super(isWorked, weight, gender, age);
        this.i = i;
    }

    public void m(String s) {
        System.out.println(s);
    }
}
