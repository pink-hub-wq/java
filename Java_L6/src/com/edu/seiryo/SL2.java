package com.edu.seiryo;

public class SL2 {
	public static void main(String[] args) {
		//实例化十个对象
		for(int i = 1;i <= 10;i++){
			SL1 houge = new SL1();
			/*每个猴子吃一个桃
			 * 用类访问静态变量
			 */
			SL1.peach = SL1.peach - 1;
			System.out.println("还有" + SL1.peach + "个桃");
		}
	}
}
