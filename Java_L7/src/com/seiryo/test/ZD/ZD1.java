package com.seiryo.test.ZD;

public class ZD1 {
	public static void main(String[] args) {
		String str1 = "Seiryo";
		String str2 = "123";
		//计算字符串的长度
		System.out.println(str1.length());
		//比较两个字符串的大小
		System.out.println(str1.compareTo(str2));
		//拼接两个字符串
		System.out.println(str1.concat(str2));
		//判断字符串值是否相等
		System.out.println(str1.equals(str2));
		//截取字符串
		System.out.println(str1.substring(2,5));
		//将数字字符串转换为数字型
		System.out.println(String.valueOf(str2));
	}
}
