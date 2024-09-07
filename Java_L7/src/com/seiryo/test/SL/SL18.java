package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 常用的时间格式化格式
 */
public class SL18 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前时间是：" + sdf1.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("当前时间是：" + sdf2.format(date));
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println("当前时间是：" + sdf3.format(date));
	}
}
