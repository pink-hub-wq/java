package com.edu.seiryo;

public class SL10 {
	int a = 1;
	static int b = 1;
	//代码块
	{
		System.out.println("实例变量a=" + a);
		System.out.println("代码块执行！");
	}
	//静态代码块
	static {
		System.out.println("静态变量b=" + b);
		System.out.println("静态代码块执行！");
	}
	//构造方法
	SL10(){
		System.out.println("构造方法执行");
	}
}
