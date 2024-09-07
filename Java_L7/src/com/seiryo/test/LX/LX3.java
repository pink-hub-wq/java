package com.seiryo.test.LX;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LX3 {
	public static void main(String[] args) throws ParseException {
		 String time1 = "2005-07-05";
		 String time2 = "2009-01-01";
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 Date date1 = sdf.parse(time1);
		 Date date2 = sdf.parse(time2);
		 long haomiaochayi = date2.getTime() - date1.getTime();
		 long tianshuchayi = haomiaochayi / (24 * 60 * 60 * 1000);
		 System.out.println("二者相差" + tianshuchayi + "天");
	}
}
