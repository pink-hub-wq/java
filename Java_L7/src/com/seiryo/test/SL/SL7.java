package com.seiryo.test.SL;
/**
*equal s()方法，判断对象是否相等
*/
public class SL7 {
	public static void main(String[] args){
		String strl = new String("Seiryo");
		String str2 = new String("Seiryo");
		//"=="判断引用地址是否相等
		if (strl == str2) {
		System.out.println("引用相等");
		}else{
		System.out.println("引用不相等");
		}
		//判断实际对象是否相等
		if (strl.equals (str2)) {
		System.out. println("值相等");
		}
	}
}
