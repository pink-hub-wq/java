package java_L10;

import java.util.ArrayList;
import java.util.List;

public class SL1 {
	public static void main(String[] args) {
        String a = "�������ʦA";
        String b = "�������ʦB";
        String c = "�������ʦC";
        String d = "�������ʦD";
        String repeat = "Repeat";
        List<String> list = new ArrayList<String>();
        list.add(a);
        list.add(repeat);
        list.add(b);
        list.add(repeat);
        list.add(c);
        list.add(repeat);
        list.add(d);
        System.out.println(list.indexOf(repeat));
        System.out.println(list.lastIndexOf(repeat));
        System.out.println(list.indexOf(b));
        System.out.println(list.lastIndexOf(b));
    }
}
