package java_L13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SL5 {
	public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(df.format(date));
        String strDate = "2014-03-22 12:25:35";
        System.out.println(df.parse(strDate));
    }
}
