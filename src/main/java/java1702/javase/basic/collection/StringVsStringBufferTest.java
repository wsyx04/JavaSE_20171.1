package java1702.javase.basic.collection;

/**
 * Created by whb on
 * 2017/3/29 10:55
 */
public class StringVsStringBufferTest {

    private static final String ALOHABET = "asadadassfafassfasfa";
//
//
//
    public static void main(String[] args) {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(ALOHABET);
//
        }
        System.out.println("time:" + (System.currentTimeMillis() - start));
        System.out.println(stringBuffer.length());
    }


}


