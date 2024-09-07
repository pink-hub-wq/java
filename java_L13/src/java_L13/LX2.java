package java_L13;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LX2 {
	public static int getDayOfYear(String date){
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            cal.setFirstDayOfWeek(Calendar.MONDAY);
            cal.setMinimalDaysInFirstWeek(1);
            cal.setTime(df.parse(date));
            return cal.get(Calendar.DAY_OF_YEAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("2014��2��14����2014��ĵ�" + getDayOfYear("2014-02-14") + "��");
    }
}
