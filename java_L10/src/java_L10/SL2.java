package java_L10;

import java.util.LinkedList;
import java.util.List;

public class SL2 {
	public static void main(String[] args) {
        String a = "�������ʦA";
        String b = "�������ʦB";
        String c = "�������ʦC";
        String d = "�������ʦD";
        String e = "�������ʦE";
        List<String> list = new LinkedList<String>();
        list.add(a);
        list.add(e);
        list.add(d);
        list.set(1,b);
        list.add(2,c);
        System.out.println(list.toString());
    }
}
