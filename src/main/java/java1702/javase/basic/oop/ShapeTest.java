package java1702.javase.basic.oop;

/**
 * Created by whb on
 * 2017/3/23 10:57
 */
public interface ShapeTest {

     double getPerimeter();
     double getArea();

}

class CircleTests implements ShapeTest {
    private double pi = 3.14;
    private  double radiu = 5d;

    public CircleTests(double radiu) {
        this.radiu = radiu;
    }

    public CircleTests() {

    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radiu;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radiu,2);
    }

    public static void main(String[] args) {
        CircleTests circleTests = new CircleTests();
        System.out.println(circleTests.getArea());

    }
}


class TriangeTest implements ShapeTest {


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
