package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by whb on
 * 2017/4/27 8:58
 */
public class text {
    public static void main(String[] args) {
        //Pattern 模式
        //Matcher 匹配
        Pattern pattern = Pattern.compile("L");//JS var pattern = /e/ ;
        Matcher matcher = pattern.matcher("hello");
        //System.out.println(matcher.find());
        while (matcher.find()) {
//            System.out.println(matcher.find());
            System.out.println(matcher.group());
        }
    }
}
