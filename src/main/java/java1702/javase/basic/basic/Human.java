package java1702.javase.basic.basic;

    /**
     * Created by 王洪博 on 2017/3/15.
     */
public class Human {
   private boolean isWorked;
    private int weight;
   private char gender;
   private int age;


        public void eat() {

    }

    public void play() {

    }

    public void sing() {

    }

    public static void main(String[] args) {
        Human human = new Human(true,2,'d',20);

        System.out.println(human.age);
    }

    public Human(boolean isWorked, int weight, char gender, int age) {
        this.isWorked = isWorked;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }
}
