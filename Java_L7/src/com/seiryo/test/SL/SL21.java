package com.seiryo.test.SL;

import java.util.Calendar;

/**
 *Calendar类对象和getTime()方法
 */
public class SL21 {
	public static void main(String[] args) {
		//获取Calendar类的对象righrNow
		Calendar rightNow = Calendar.getInstance();
		//使用getTime()方法返回当前的时间
		System.out.println("当前时间：" + rightNow.getTime());
	}
}
