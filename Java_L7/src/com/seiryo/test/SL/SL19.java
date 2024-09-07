package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * "H"与"h"的区别
 */
public class SL19 {
	public static void main(String[] args) {
		Date date = new Date();
		//"H"表示24小时制
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前时间是：" + sdf1.format(date));
		//"h"表示12小时制
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("当前时间是：" + sdf2.format(date));
	}
}
