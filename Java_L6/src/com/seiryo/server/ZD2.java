package com.seiryo.server;

public class ZD2 {
	//车轮的个数
	final int WHEELS = 4;
	char color;
	//构造方法
	public ZD2(char c){
		color = c;
	}
	public void print(){
		System.out.println("颜色是：" + color + "色，车轮是：" + WHEELS );
	}
}
