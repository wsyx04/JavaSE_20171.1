package java1702.javase.basic.oop;

import java.util.Calendar;

/**
 * Created by whb on
 * 2017/3/23 11:32
 */
//输出某年某地的日历
//
//
// 1
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,0,8);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }


}
