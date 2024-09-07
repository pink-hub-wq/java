package com.seiryo.test.SL;
/**
*subString()方法，截取字符串
*/
public class SL5 {
	public static void main(String[] args) {
		String strl = "seiryo";
		//截取指定位置之后的所有字符串
		String str2 = strl.substring(2);
		//截取指定位置开始指定长度的字符转
		String str3 = strl.substring(2, 4);
		System. out. println (str2);
		System. out. println(str3);
	}
}
