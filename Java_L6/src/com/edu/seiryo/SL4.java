package com.edu.seiryo;
/*
 * 静态变量与实例变量的区别
 */
public class SL4 {
	public static void main(String[] args) {
		SL3 s1 = new SL3();	//实例化一个对象
		s1.a++;							//实例变量自增
		s1.b++;							//静态变量自增
		System.out.println("实例变量a=" + s1.a);
		System.out.println("静态变量b=" + SL3.b);//类名直接访问
		SL3 s2 = new SL3();				//实例化一个对象
		s2.a++;							//实例变量自增
		s2.b++;							//静态变量自增
		System.out.println("实例变量a=" + s2.a);
		System.out.println("静态变量b=" + SL3.b);//类名直接访问
	}
}
