package com.seiryo.test.SL;
/**
*concat()方法，返回一个新字符串
*/
public class SL3 {
	public static void main(String[] args) {
		String strl = "seiryo";
		String str2 = "123";
		//在str1的后面连接上str2，并返回一个新的字符串
		String str3 = strl.concat (str2);
		System.out.println(str3);
	}
}