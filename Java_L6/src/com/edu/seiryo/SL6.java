package com.edu.seiryo;

public class SL6 {
	public static void main(String[] args) {
		//实例化十个对象
		for(int i = 1;i <= 10;i++){
			SL5 houge = new SL5();
			//通过类名调用静态方法
			SL5.play ();
		}
	}
}
