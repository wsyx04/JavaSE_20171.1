package java1702.javase.basic.collection;

/**
 * Created by whb on
 * 2017/3/28 9:07
 */
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[2][3];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
                System.out.println(ints[i][j] + "\t");
            }


        }
        String[][] strings = new String[3][];
        strings[0] = new String[4];
        strings[1] = new String[2];
        strings[2] = new String[1];

        double[][] doubles = {
                {1d, 2d, 3d, 4d},
                {1d, 2d},
                {1d}
        };
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.print(doubles[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
