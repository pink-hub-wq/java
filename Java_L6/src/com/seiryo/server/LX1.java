package com.seiryo.server;

public class LX1{
    //静态变量
	static int a;
	//静态方法
	public static void staticMethod(){
		System.out.println("静态方法执行");
	}
	//静态代码块
	static{
			System.out.println("静态代码块执行");
	}
	//构造方法
	public LX1(){
		System.out.println("构造方法执行");
	}
	//非静态代码块
	{
		System.out.println("非静态代码块执行");
	}
	//非静态方法
	public void killNiu(){
		System.out.println("killNiu方法执行");
	}
}