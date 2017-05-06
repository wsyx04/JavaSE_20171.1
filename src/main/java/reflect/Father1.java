package reflect;

import java.lang.reflect.ParameterizedType;

/**
 * Created by whb on
 * 2017/5/5 16:05
 */
public class Father1<C> {
    public Father1() {
        System.out.println(((Class) (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0])).getSimpleName());
    }
}

class SonA extends Father1<Doctor> {
}

class SonB extends Father1<Lawyer> {
}

class SonC extends Father1<Programmer> {
}

class SonD extends Father1<Programmer> {
}

class Doctor {
}

class Lawyer {
}

class Programmer {
}

class SonTest {
    public static void main(String[] args) {
        SonA sonA = new SonA();
        SonB sonB = new SonB();
        SonC sonC = new SonC();
        SonD sonD = new SonD();
    }
}
