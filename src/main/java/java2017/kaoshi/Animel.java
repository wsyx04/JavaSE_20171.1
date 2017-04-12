package java2017.kaoshi;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

/**
 * Created by whb on
 * 2017/4/8 14:19
 */
//按以下要求编写程序
//(1) 编写 Animal 接口，接口中声明 eat() 方法
// (2) 定义Bird类和 Fish 类实现 Animal 接口,Bird 中还有 flying 方法，Fish 中还有 swimming 方法，分别实现这些方法
// (3) 编写 Bird 类和 Fish 类的测试程序，并调用其中的各个方法
public interface Animel {
    void eat();
}

class Bird implements Animel {

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    public void flying() {
        System.out.println("飞");
    }


}


class Fish implements Animel {

    @Override
    public void eat() {
        System.out.println("吃河泥");
    }

    public void swimming() {
        System.out.println("游");
    }
}

class CeshiTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        bird.eat();

        bird.flying();
        fish.eat();
        fish.swimming();
    }
}