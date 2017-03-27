package java1702.javase.basic.collection;

/**
 * Created by whb on
 * 2017/3/27 15:14
 */
public class ArrayTest {

    public static void main(String[] args) {
        String[] strings;
        strings = new String[10];
        strings[0] = "test...";
        System.out.println(strings[0]);

        boolean[] booleans = new  boolean[100];
        System.out.println(booleans[99]);

        int[] ints = {1,2,3,4,5,6,6777,8889};
        System.out.println(ints[7]);

        double[] doubles = new double[10000];
        System.out.println(doubles.length);

        ArrayTest[] arrayTests = {new ArrayTest(),new ArrayTest(),new ArrayTest()};
        //
        System.out.println(arrayTests[0]);
        System.out.println(arrayTests[1]);
        System.out.println(arrayTests[2]);
String[] months = {"Jan","Fed","Mar","Apr","May"};

        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            System.out.println(month);
        }

            System.out.println("--------------");


            for (String month : months) {
                System.out.println(month);
            }


        }
    }



