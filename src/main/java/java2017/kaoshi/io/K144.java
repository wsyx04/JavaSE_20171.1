package java2017.kaoshi.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

/**
 * Created by whb on
 * 2017/4/27 9:57
 */
//随机生成5000个（1，9999）之间的随机数，将其存入文本文件a.txt中
//从文件中读取这5000个整数，并计算其最大值，最小值和平均值并输出结果
public class K144 {
    private static final int N = 5000;

    public static void main(String[] args) {

        int sum = 0;
        int min = 9998;
        int max = 2;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        try (RandomAccessFile raf = new RandomAccessFile("a.txt", "rw")) {
            for (int i = 0; i < N; i++) {
                int r = (int) (Math.random() * 9997) + 2;
                try {
                    raf.writeInt(r);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            raf.seek(0);
            for (int i = 0; i < N; i++) {
                int r = raf.readInt();
                list.add(r);
                set.add(r);
                if (r < min) {
                    min = r;
                }
                if (r > max) {
                    max = r;
                }
                sum += r;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(min + ":" + max);
//        Collections.sort(list);
        System.out.println(Collections.min(list) + ":" + Collections.max(list));
        System.out.println(sum / N);
        List<Integer> integers = new ArrayList<>(set);
        System.out.println(integers.get(0) + ":" + integers.get(integers.size() - 1));
    }
}
