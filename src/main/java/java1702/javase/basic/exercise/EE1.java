package java1702.javase.basic.exercise;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by whb on
 * 2017/3/21 16:40
 */
// 猜数字
// 1.生成一个随机数字（10000） 100 小了 1000 小了
// 1
public class EE1 {

    private static int x;
    private static int counter;

    public static void main(String[] args) {

        Random random = new Random();
         x = random.nextInt();
        guess();
    }
    private static void guess() {

        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (y > x) {
            System.out.println("大");
            counter++;
            guess();
        } else if (y < x){
            System.out.println("小");
            counter++;
            guess();
        } else if (x == y) {
            System.out.println("对");
            counter++;
            System.out.println(counter);
        }
    }



}
