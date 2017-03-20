package java1702.javase.basic;

/**
     * Created by 王洪博 on 2017/3/15.
     */
public class Vehicle {
    String name;
    double weight;//kg
    double price;//价格 元
    char color;
        public Vehicle(String name, double weight, double price, char color) {
            this.name = name;
            this.weight = weight;
            this.price = price;
            this.color = color;
        }
//        public java1702.javase.basic.Vehicle() {
//        }
      /*  public java1702.javase.basic.Vehicle() {
            System.out.println("Vechicle constructor...");
        }*/
        public void start() {
        System.out.println("java1702.javase.basic.Vehicle is starting");
    }
    public void stop() {
        System.out.println("java1702.javase.basic.Vehicle is stopped");
    }
}
class Bicycle extends Vehicle {
    String type;//山地车
//    public java1702.javase.basic.Bicycle() {
//        System.out.println("java1702.javase.basic.Bicycle constructor..");
//    }

    @Override
    public void start() {
        super.start();

    }

    @Override
    public void stop() {
        super.stop();
    }

    public Bicycle(String name, double weight, double price, char color) {
        super(name, weight, price, color);
    }
}
//    public java1702.javase.basic.Bicycle(String name, double weight, double price, char color) {
//        super(name, weight, price, color);
//    }
//    public void ring() {
//        System.out.println("java1702.javase.basic.Bicycle is ringing...");
//    }
//}
//class Ship extends java1702.javase.basic.Vehicle {
//double tonnage;// t 排水量
//
//    public void anchor() {
//        System.out.println("Ship is anchor...");
//    }
//}
//class Plane extends java1702.javase.basic.Vehicle {
//}
class VehicleTest {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("jk",1,52,'r');
//        System.out.println(bicycle.name);
//        bicycle.start();
//        bicycle.stop();
//        Ship ship = new Ship();
//        System.out.println(ship.weight);
//        ship.start();
//        ship.stop();
//        Plane plane = new Plane();
//        System.out.println(plane.color);
//        plane.start();
    }
}
