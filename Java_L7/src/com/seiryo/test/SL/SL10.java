package com.seiryo.test.SL;
/**
*insert()方法，在指定位置插入字符串
*/
public class SL10 {
	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Seiryo");
	//第三个位置上插入"123"，位置下标从0开始
	sb.insert (2, "123");
	System.out.println(sb);
	}
}