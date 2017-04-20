package java1702.javase.basic.generic;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * Created by whb on
 * 2017/4/18 9:23
 */
public class CheckedExceptionText {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("input a file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "r");
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("file not found !");
            test();//recursive 递归调用


        }
    }
}
