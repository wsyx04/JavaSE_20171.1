package java1702.javase.basic.exercise;

/**
 * Created by whb on
 * 2017/3/23 8:58
 */
public interface InterfaceTest extends A,B,C,D {
    int ONE = 1;
    void v();
}

interface A {

    void a();
}

interface B {
    void b();

}

interface C {

    void c();
}

interface D {
    void d();

}

class InterfaceTestImpl implements InterfaceTest,A,B,C,D {

    @Override
    public void v() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {
        System.out.println(ONE);
    }

    public static void main(String[] args) {

    }
}

class StaticFieldTest {
    private static int i = 1;
    public void m() {
        System.out.println(i);
    }
}