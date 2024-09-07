package com.seiryo.test.SL;
/**
 * 自动转换
 */
public class SL14 {
	public static void main(String[] args) {
		//int类型自动转换为Integer类型
		int m = 12;
		Integer in = m;
		//Integer类型将自动转换为int类型
		int n = in;
		System.out.println(in);
		System.out.println(n);
	}
}
