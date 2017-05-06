package reflect;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;

/**
 * Created by whb on
 * 2017/5/5 15:32
 */
public class Father {
}

interface InterfaceTest {

}

class Son extends Father implements InterfaceTest {
    public static void main(String[] args) {
        //1.son > father
        Class clazz = Son.class;
        System.out.println(clazz.getSuperclass().getSimpleName());

        //2.son > inter
        System.out.println();
    }
}