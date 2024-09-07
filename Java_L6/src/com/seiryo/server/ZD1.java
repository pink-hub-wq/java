package com.seiryo.server;
/**
 * 静态变量、静态方法、静态代码块
 */
public class ZD1 {
	//静态变量
	static int a;
	//静态代码块
	static{
		a = 10;
		System.out.println("静态变量a=" + a);
	}
	//静态方法
	public static void printStatic(int b){
		a = b;
		System.out.println("静态变量a=" + a);
	}
}
