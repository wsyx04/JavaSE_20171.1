package java2017.kaoshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by whb on
 * 2017/4/15 9:11
 */
public class K119 {
    public static void main(String[] args){
        K119 text=new K119();
        String result=text.getMinString("abbccd");
        System.out.println(result);
    }
    public String getMinString(String input){
        System.out.println(input);
        char[] c=input.toCharArray();
        List<String> list=new ArrayList<String>();
        for(int i=0;i<c.length;i++)
            list.add(c[i]+"");

        int minTime=0;
        int[] count=new int[list.size()];
        for(int i=0;i<count.length;i++)
            count[i]=0;

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i).equals(list.get(j)))
                    count[i]++;
            }
            minTime=count[1];
            if(minTime>=count[i])
                minTime=count[i];
        }

        StringBuffer sb=new StringBuffer();
        for(int i=0;i<count.length;i++){
            if(count[i]>minTime)
                sb.append(list.get(i));
        }
        return  sb.toString();

    }


}
