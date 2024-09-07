package com.seiryo.test.SL;
/**
 * 自动转换
 */
public class SL15 {
	public static void main(String[] args) {
		//返回绝对值
		System.out.println("-12的绝对值：" + Math.abs(-12));
		//返回四舍五入的整数值
		System.out.println("3.3四舍五入的整数值：" + Math.round(3.3));
		System.out.println("-3.3四舍五入的整数值：" + Math.round(-3.3));
		//返回两个参数的较大或较小值
		System.out.println("5和9的较大值：" + Math.max(5, 9));
		System.out.println("5和9的较小值：" + Math.min(5, 9));
		//返回自然对数E和圆周率PI的值
		System.out.println("自然对数E的值：" + Math.E);
		System.out.println("圆周率PI的值：" + Math.PI);
		//返回10-20之间的随机数
		System.out.println("随机数是：" + (int)(Math.random() * 10 + 10));
		//返回自然对数的幂
		System.out.println("3的幂是" + Math.exp(3));
	}
}
