package com.seiryo.test.SL;
/**
 * 创建字符串
 * String是java.lang中的类，所以不需要import语句
 */
public class SL1{
	public static void main(String[] args) {
		//第一种方式创建字符串
		String str1;
		str1 = "hello seiryo!";
		//第二种创建字符串方式
		String str2 = "hello seiryo!";
		//使用new关键字创建字符串
		String str3 = new String("hello seiryo!");
		//打印str1,str2,str3
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println("str3:" + str3);
	}
}