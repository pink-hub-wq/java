package java_L10;

import java.util.*;
public class SL5 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(220180,null);
        map.put(220181,"����");
        System.out.println("get()�����ķ��ؽ����");
        System.out.print("-----" + map.get(220180));
        System.out.print(" " + map.get(220181));
        System.out.println(" " + map.get(220182));
        System.out.println("containsKey()�����ķ��ؽ����");
        System.out.print("-----" + map.containsKey(220180));
        System.out.print(" " + map.containsKey(220181));
        System.out.println(" " + map.containsKey(220182));
    }
}
