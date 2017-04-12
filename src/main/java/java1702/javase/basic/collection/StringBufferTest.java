package java1702.javase.basic.collection;

/**
 * Created by whb on
 * 2017/3/29 11:27
 */
public class StringBufferTest {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append("world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5,6));
        System.out.println(stringBuffer.insert(5,'w'));
        System.out.println(stringBuffer.reverse());
        stringBuffer.reverse().setCharAt(0,'H');
        System.out.println(stringBuffer);
        // java.lang.StringBuffer
        // buffer 缓冲\ ['bʌfə]


        // append 附加\ [ə'pend]
        // prepend

        // String 不可变
//        s2 += "123";
        // string pool : "true" "true123"

//        System.out.println(stringBuffer.delete(4, 6));
//        // insert 插入\ [ɪn'sɜːt]
//        // offset 偏移,\ 抵消,\ 位移
//        System.out.println(stringBuffer.insert(4, false)); // truefalse3

        // reverse vt.\ 颠倒；倒转


    }
}
