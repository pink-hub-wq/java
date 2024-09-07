package com.seiryo.server;

public class LX2 {
	static int a;
	static int b;
	static{
		a = 10;
		b = 20;
		System.out.println("静态代码块被执行");
	}
	public static void printsum(){

		System.out.println("a和b的和是" +( a + b));
	}
	public LX2(){
		System.out.println("构造方法被执行");
	}
}
