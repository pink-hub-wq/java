package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Calendar类的初始化和getTime()方法
 */

public class SL22 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//格式化日期
		String today = sdf.format(rightNow.getTime());
		System.out.println("今天是：" + today);
		//修改日期"DATE"常量表示一个月中的某一天，"-1"表示减一天
		rightNow.add(Calendar.DATE, -1);
		String yesterday = sdf.format(rightNow.getTime());
		System.out.println("昨天是：" + yesterday);
		
	}
}
