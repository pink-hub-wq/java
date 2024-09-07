package com.seiryo.test.SL;
/**
*concat()方法，返回一个新字符串
*/
public class SL4 {
	public static void main(String[] args){
		int a = 100;
		int b = 2;
		//将整型变量转换成字符串，然后进行连接
		String strl = String.valueOf (a) + String.valueOf (b);
		//使用concat()方法进行连接
		String str2 = String.valueOf(a).concat(String. valueOf(b));
		System.out.println("第一种连接方式结果：" + strl);
		System.out.println("第二种连接方式结果：" + str2);
	}
}
