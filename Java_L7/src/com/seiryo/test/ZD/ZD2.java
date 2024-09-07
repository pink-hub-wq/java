package com.seiryo.test.ZD;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ZD2 {
	public static void main(String[] args) {
		Date date = new Date();
		//指定格式
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		//format()方法，将Data类型转换成字符串
		String d = sdf.format(date);
		System.out.println(d);
	}
}
