package java_L10;

import java.util.*;
public class SL7 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("����","010");
        map.put("����","020");
        map.put("�Ϻ�","021");
        map.put("�人","027");
        System.out.println("��ʾ���еĵ绰���ţ�");
        Set<String> setCitys = map.keySet();
        Iterator<String> itCity = setCitys.iterator();
        while (itCity.hasNext()){
            String city = itCity.next();
            String code = map.get(city);
            System.out.println(city + "�ĵ绰�����ǣ�" + code);
        }
    }
}

