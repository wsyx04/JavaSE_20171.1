package java2017.kaoshi.io;

import java.io.*;

/**
 * Created by whb on
 * 2017/4/22 9:51
 */
//编写一个程序,其功能是将两个文件的内容合并到一个文件中
//例如：1.txt 内容为 abc；2.txt 内容为 def；生成新文件3.txt 内容为 abcdef
public class K143 {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("3");
            writer.write("abcdef");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
