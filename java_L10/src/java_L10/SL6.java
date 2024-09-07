package java_L10;

import java.util.*;
public class SL6 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("北京","010");
        map.put("广州","020");
        map.put("上海","021");
        map.put("武汉","027");
        System.out.println("显示城市的电话区号：");
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            String city = (String)it.next();
            String code = (String)map.get(city);
            System.out.println(city + "的电话区号是：" + code);
        }
    }
}

