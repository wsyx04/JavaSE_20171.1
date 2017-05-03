package java1702.javase.basic.generic;

/**
 * Created by whb on
 * 2017/4/13 11:46
 */
public interface GenericInterfaceTest<T> {
    void method(T t) ;
//    void  m2(T t1,T t2);


}

class GenericInterfaceTestImpl<T extends Number> implements GenericInterfaceTest<T> {


    @Override
    public void method(T t) {

    }
}

