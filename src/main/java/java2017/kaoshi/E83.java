package java2017.kaoshi;

/**
 * Created by whb on
 * 2017/3/25 9:26
 */
public class E83 {
}

interface Flying {
    void fly();
}

interface Swiming {
    void swim();
}
class Cat extends Animal implements Flying,Swiming {

    String name;
    int age;

    public void play() {}
    public void run() {}

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void shout() {
        super.shout();
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}