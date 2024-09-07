package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * set()方法
 */
public class SL24 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//格式化后输出
		System.out.println("今天是：" + sdf.format(rightNow.getTime()));
		//"get(Calendar.DAY_PF_WEEK)"表示星期几
		System.out.println("星期：" + rightNow.get(Calendar.DAY_OF_WEEK));
	}
}
