package io;

import com.sun.org.apache.xml.internal.serializer.ToStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by whb on
 * 2017/4/18 10:38
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("d:/test.txt");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {

                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

