package java_L10;

import java.util.LinkedList;
import java.util.List;

public class SL2 {
	public static void main(String[] args) {
        String a = "软件工程师A";
        String b = "软件工程师B";
        String c = "软件工程师C";
        String d = "软件工程师D";
        String e = "软件工程师E";
        List<String> list = new LinkedList<String>();
        list.add(a);
        list.add(e);
        list.add(d);
        list.set(1,b);
        list.add(2,c);
        System.out.println(list.toString());
    }
}
