package java1702.javase.basic.oop;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by whb on
 * 2017/3/24 8:59
 */
public class ScopeTest {



    public void main(String[] args) {
            i = 0 ;
        int j = 0;
        System.out.println(j);
        for (int f = 0; f <10 ; f++) {
            System.out.println(f);
        }
        for (int o= 0; o <100 ; o++) {
            System.out.println(o);
        }

    }
private int i;

    public void exceptionTest() {
       String s;
        try {
            s = "hello";

        }catch (Exception e) {

        } finally {
            s = "hi";
        }
    }


}
