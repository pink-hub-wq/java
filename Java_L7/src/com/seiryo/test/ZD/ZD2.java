package com.seiryo.test.ZD;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ZD2 {
	public static void main(String[] args) {
		Date date = new Date();
		//ָ����ʽ
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		//format()��������Data����ת�����ַ���
		String d = sdf.format(date);
		System.out.println(d);
	}
}
