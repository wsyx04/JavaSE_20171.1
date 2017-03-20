package java1702.javase.basic;

/**
     * Created by 王洪博 on 2017/3/7.
     */
public class Variable { //变量
    public static void main(String[] args) {
        int i = 100;
        System.out.println(i);
        boolean b;//声明
        b = true;//赋值
        System.out.println(b);//initialized初始化
        String s; //字符串//引用数据类型 属于Class
        s = "dasdasdasd dasdasd   asdasd asd asd ad dasddas ad a !@#!$!#$ 活生生s";
        System.out.println(s);
        char c1 = '中';
        System.out.println(c1);
        char c2 = '\t';
        char c3 = '\u4fff';
        char c4 = '\123';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        int m = 1000;
        int n = 300;
        System.out.println(m % n );

        int a = 1;
        int w = 2;
        System.out.println( a == w );





        boolean x = true;
        boolean y = false;
        System.out.println( x ^ y );
        System.out.println( x || y );
        System.out.println( !x );

        int e = 1;
        int r = 1;
        System.out.println( e & r );//00...1  00...1  =  00...1
        System.out.println( e | r );//00...1  00...1  =  00...1
        System.out.println( e >> r);//00...01  00...1 =
        System.out.println( e ^ r );//=0
        System.out.println( e << r );//00...10   =  2
        System.out.println( e >>> r );//

        int g = 0;
        g += 1;// g = g + 1 / g = 1 /
        g -= 2;// g = 1 - 2 / g = -1/
        g *= 5;// g = -1 * 5 / g = -5/
        g /= 4;// g = -5 / 4 ; g = -1/
        g %= 5;// g = -1 % 5 ; g = -1 /
        System.out.println( g );
        //  g = -1;
        int h = 0;
        h &= 2;
        System.out.println(h);

        char f = 5 ;
        int o = f;
        System.out.println(o);
    }
}
