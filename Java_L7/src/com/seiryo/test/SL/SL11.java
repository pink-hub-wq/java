package com.seiryo.test.SL;
/**
*int和Integer之间的转换
*/
public class SL11 {
	public static void main (String[] args){
	int n = 10;
	Integer in = new Integer (100) ;
	//将int类型转换为Integer类型Integer 
	Integer inl = new Integer (n);
	//将Integer类型的对象转换为int类型
	int m = in. intValue();
	System.out.println (inl);
	System.out.println(m);
	}
}
