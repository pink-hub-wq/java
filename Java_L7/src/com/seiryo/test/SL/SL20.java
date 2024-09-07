package com.seiryo.test.SL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将字符串转换为时间类型
 */
public class SL20 {
	public static void main(String[] args) throws ParseException {
		//用户输入的时间
		String birthday = "1986-04-07";
		//格式化标准
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//parse()方法把字符串转换为int类型
		Date d = sdf.parse(birthday);
		System.out.println("转换成Date类型的时间是：" + d);
	}
}
