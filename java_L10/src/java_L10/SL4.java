package java_L10;

import java.util.*;
public class SL4 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("abc");
        set.add("cde");
        set.add("efg");
        set.add("fgh");
        set.add("abc");
        System.out.println("size = " + set.size());
        System.out.println("set = " + set.toString());
        List list = new ArrayList();
        list.add("abc");
        list.add("aaa");
        list.add("fff");
        set.addAll(list);
        System.out.println("size = " + set.size());
        System.out.println("set = " + set.toString());
    }
}

