package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * set()方法
 */
public class SL23 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		//指定某年某月某日
		rightNow.set(2001, 11, 01);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//格式化后输出
		System.out.println("设置的日期为：" + sdf.format(rightNow.getTime()));
	}
}
