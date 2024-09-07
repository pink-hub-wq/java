package com.edu.seiryo;

public class SL15 {
	//将PI定义为常量
	static final double PI = 3.1415926;
	//半径
	int r;
	SL15(int radius){
		r = radius;
	}
	double getAreas(){
		return 2 * PI * r;
	}
}
