package java1702.javase.basic.oop;

/**
 * Created by whb on
 * 2017/3/21 10:11
 */
// illegal 非法的
// combination共存
//
//
// 1
public abstract class Shape {

     public abstract double getPerimeter();
     public abstract double getArea();

}

class CircleTest extends Shape {
    private double pi = 3.14;
    private  double radiu;

    public CircleTest(double radiu) {
        this.radiu = radiu;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radiu;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radiu,2);
    }
}


class Triange extends Shape {


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}


