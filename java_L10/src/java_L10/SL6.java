package java_L10;

import java.util.*;
public class SL6 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("����","010");
        map.put("����","020");
        map.put("�Ϻ�","021");
        map.put("�人","027");
        System.out.println("��ʾ���еĵ绰���ţ�");
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            String city = (String)it.next();
            String code = (String)map.get(city);
            System.out.println(city + "�ĵ绰�����ǣ�" + code);
        }
    }
}

