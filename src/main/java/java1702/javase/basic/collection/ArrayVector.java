package java1702.javase.basic.collection;

/**
 * Created by whb on
 * 2017/3/31 9:17
 */
public class ArrayVector {
    private static final int DEFAULT_CAPCITY = 10;
    private String[] strings;
    private int capacity;
    private int size;

    private ArrayVector() {
        strings = new String[DEFAULT_CAPCITY];
        capacity = DEFAULT_CAPCITY;
    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
        capacity = initialCapacity;
    }

    public void add(String string) {
        if (size == capacity) {
            String[] newstrings = new String[capacity * 2];
            capacity *= 2;
            System.arraycopy(strings, 0, newstrings, 0, strings.length);
            strings = newstrings;
        }
        strings[size] = string;
        size++;
    }

    public String get(int index) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        return strings[index];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public String remove(int index) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        String s = strings[index];
        System.arraycopy(strings, index + 1, strings, index, size - index - 1);
        strings[size - 1] = null;
        size--;
        return s;

    }
       boolean a = (9 >= 10);
    public String set(int index, String element) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        String s = strings[index];
        strings[index] = element;
        return s;
    }

    public static void main(String[] args) {
        ArrayVector arrayVector = new ArrayVector(2);
        arrayVector.add("hello");
        arrayVector.add("hi");
        System.out.println(arrayVector.size());
        System.out.println(arrayVector.capacity());
    }


}
