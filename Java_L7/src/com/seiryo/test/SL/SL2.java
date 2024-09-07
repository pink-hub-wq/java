package com.seiryo.test.SL;
/**
*length()
*/
public class SL2 {
	public static void main(String[] args) {
	//定义字符串
	String strl = "Seiryo";
	String str2 = "";
	String str3 = null;
	//length()方法，返回整型，如果字符串为空则返回零。
	int l1 = strl.length();
	//字符串为“""”时，表示分配内存空间，只是值为空。
	int l2 = str2.length();
	/*字符串为null时，表示没有分配内存空间，所以不能计算其长度
	*否则会产生"空指针"异常
	*/
	//int l3 = str3.length();
	System.out.println("str1的长度为："+ l1);
	System.out.println("str2的长度为："+ l2);
	}
}

