package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat类的使用
 */
public class SL17 {
	public static void main(String[] args) {
		//实例化date对象
		Date date = new Date();
		//自定义字符串类型格式
		String formate = "yyyy年MM月dd日 HH时mm分ss秒";
		//实例化sdf对象
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		//转换成指定格式的字符串
		String currentDate = sdf.format(date);
		System.out.println("当前时间是：" + currentDate );
	}
}
