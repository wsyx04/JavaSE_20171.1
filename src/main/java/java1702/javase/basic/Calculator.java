package java1702.javase.basic;

/**
     * Created by 王洪博 on 2017/3/15.
     */
public class Calculator  {  //计算器
   // private int x;
    //private  int y;  //私有的

    //  add加法
    //public int add() {
//        return x + y;
    //}
    public static void main(String[] args) {
        CalculatorText calculatorText = new CalculatorText();
        System.out.println(calculatorText.add(1d,2d));
        System.out.println(calculatorText.add(1,2d));
        System.out.println(calculatorText.add(1d,2));
        System.out.println(calculatorText.add(1d,2d,3));
    }

}
         class CalculatorText {
        public double add(double x,double y) {
            return x + y;
        }public int add(int x,double y) {
            return 1;
        }public int add(double x,int y) {
            return 25;
        }public double add(double x,double y,double z) {
            return x + y + z;
        }

        }
