package java1702.javase.basic;

/**
    * Created by 王洪博 on 2017/3/16.
    */
public class Father {
        int money;
        public void coding() {
            System.out.println("java1702.javase.basic.Father is coding...");
        }
}

    class Son extends Father {


    }

    class ExtendsText {

        public static void main(String[] args) {
            Father father = new Father();
            System.out.println(father.money);
            father.coding();
            Son son = new Son();
            System.out.println(son.money);
            son.coding();
        }
    }