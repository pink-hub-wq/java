package java_L13;

import java.util.Calendar;

public class SL4 {
	public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        calendar.set(2013,2,14,12,32,12);
        System.out.println(calendar.getTime());
    }
}
