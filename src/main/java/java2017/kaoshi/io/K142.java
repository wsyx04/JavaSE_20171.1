package java2017.kaoshi.io;

/**
 * Created by whb on
 * 2017/4/22 9:12
 */
//编写一个正确处理的产生空指针异常的程序

public class K142 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            e.printStackTrace();

        }
        }
    }


