package com.edu.seiryo;

public class SL15 {
	//��PI����Ϊ����
	static final double PI = 3.1415926;
	//�뾶
	int r;
	SL15(int radius){
		r = radius;
	}
	double getAreas(){
		return 2 * PI * r;
	}
}
