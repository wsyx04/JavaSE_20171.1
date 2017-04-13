package java1702.javase.basic.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by whb on
 * 2017/4/12 15:51
 */
//使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
//添加几条信息
//列出所有的员工姓名
//列出所有员工姓名及其工资
//删除名叫 Tom 的员工信息
//输出 Jack 的工资，并将其工资改为 1500 元
//将所有工资低于 1000 元的员工的工资上涨 20%
public class E2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
//        1.
        map.put("Tom", 1000);
        map.put("Jerry", 2000);
        map.put("Jack", 900);
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        map.remove("Tom");
        System.out.println(map);
        System.out.println(map.get("Jack"));
        map.put("Jack", 1500);
        System.out.println(map.get("Jack"));
        for (String s : map.keySet()) {
            if (map.get(s) < 1000) {
                map.put(s, (int) (map.get(s) * 1.2));
            }
        }
        System.out.println(map);
    }
}
