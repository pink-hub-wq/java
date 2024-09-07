package java_L10;

import java.util.*;
public class SL7 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("北京","010");
        map.put("广州","020");
        map.put("上海","021");
        map.put("武汉","027");
        System.out.println("显示城市的电话区号：");
        Set<String> setCitys = map.keySet();
        Iterator<String> itCity = setCitys.iterator();
        while (itCity.hasNext()){
            String city = itCity.next();
            String code = map.get(city);
            System.out.println(city + "的电话区号是：" + code);
        }
    }
}

