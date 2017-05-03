package io;

import java.io.*;

/**
 * Created by whb on
 * 2017/4/20 10:04
 */
public class ReaderTest1 {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("test");
            Writer writer = new FileWriter("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
