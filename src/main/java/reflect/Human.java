package reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by whb on
 * 2017/5/3 17:30
 */
 class Animal {
    public int age;
    private double weight;
    public Animal() {
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    public int sleep(int hours) {
        return hours;
    }
    public void eat(String food) {
        System.out.println("eating" + food);
    }

    private void killHuman() {
        System.out.println("kill a poor guy...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

 }

public class Human extends Animal {
    public String name;
    private boolean married;

    public Human() {

    }


    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name + "is now eating" + food);
    }

    public void study(String course) {
        System.out.println(name + "is now eating" + course);
    }

    public void killAnimals(String animal) {
        System.out.println(name + "is now eating" + animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}

class HumanTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Human human = new Human();
        Class clazz = human.getClass();
        Field[] fields = clazz.getFields();
        System.out.println("--- getFields() ---");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declareFields = clazz.getDeclaredFields();
        System.out.println("--- getDeclaredFields() ---");
        for (Field declareField : declareFields) {
            System.out.println(declareField.getName());
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(1);
        }
        list.add(0);
        System.out.println(list.size());

//        Field array = list.getClass().getDeclaredField("elementData");
        Field array = ArrayList.class.getDeclaredField("elementData");
        array.setAccessible(true);
        System.out.println("list capacity: " + ((Object[]) array.get(list)).length); // 10


        Vector<String> vector = new Vector<>();
        vector.add("hi");
        System.out.println(vector.size());
        System.out.println(vector.capacity());





    }
}

