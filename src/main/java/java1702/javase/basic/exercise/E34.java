package java1702.javase.basic.exercise;

import java.util.Date;
import java.util.Random;

/**
 * Created by whb on
 * 2017/3/20 15:44
 */
//随机生成[1， 20]数10000次，
// 使用两种方法实现（java.lang.Math，java.util.Random），
// 并判断两种方法的效率和分布。
// util - utility  实用工具
// seed  种子
// currentTimeMills  返回系统当前时间毫秒数
// nanoTime 毫微秒数  1纳秒 = 1 * 10^ -9 秒
public class E34 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i <10000 ; i++) {
//            int r = (int)(Math.random() * 20 ) + 1;
//            System.out.println(r);
            int r = random.nextInt(20) + 1;
//            System.out.println(r);
        }
        System.out.println((1500000000000L - System.currentTimeMillis())/1000/60/60/24);
        System.out.println(new Date(1500000000000L));


    }

}
