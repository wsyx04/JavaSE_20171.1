package java1702.javase.basic.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by whb on
 * 2017/4/10 15:48
 */
public class ArrayListTest<E> extends ArrayList<E> {
    public static void main(String[] args) throws NoSuchFieldException,IllegalAccessException{
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("test1");
        strings.add("test2");
        strings.addAll(4, strings);
        for (String string : strings) {
            System.out.println(string);
        }
        strings.remove(0);
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println("-----------");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.contains("test1"));
        System.out.println(strings.containsAll(strings));
        System.out.println(strings.indexOf("test3"));
        System.out.println(strings.isEmpty());
        System.out.println(strings.lastIndexOf("test2"));
        ArrayListTest<Integer> integers = new ArrayListTest<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        integers.removeRange(1,2);

        System.out.println(integers.set(0,55));
        System.out.println(integers);
        for (Object o : integers.toArray()) {
            System.out.println(o);
        }
            System.out.println(integers.size());
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        System.out.println("capacity1 :" + ((Object[]) field.get(integers)).length);

        integers.trimToSize();
        System.out.println("capacity2 :" + ((Object[]) field.get(integers)).length);
        System.out.println(integers.size());


    }
}
