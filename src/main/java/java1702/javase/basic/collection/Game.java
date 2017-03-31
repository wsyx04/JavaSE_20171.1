package java1702.javase.basic.collection;

/**
 * Created by whb on
 * 2017/3/28 10:03
 */
public class Game {
    private static final char[] COLORS = {'红','黄','蓝','白','黑','紫'};

    public static void main(String[] args) {
        char[][] square = new char[10][10];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                square[i][j] = COLORS[(int)(Math.random()*6)];
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
