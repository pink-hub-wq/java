package com.seiryo.test.LX;

public class LX2 {
	public static void main(String[] args) {
		int randomNumber1 = (int)(Math.random() * 100 + 100);
		int randomNumber2 = (int)(Math.random() * 100 + 100);
		int randomNumber3 = (int)(Math.random() * 100 + 100);
		int max;
		int tempmax;
		int min;
		int tempmin;
		if(randomNumber1 < randomNumber2){
			tempmax = randomNumber2;
		}else {
			tempmax = randomNumber1;
		}
		if(tempmax < randomNumber3){
			max = randomNumber3;
		}else {
			max = tempmax;
		}
		System.out.println("三个随机数中的最大值为：" +max);
		if(randomNumber1 < randomNumber2){
			tempmin = randomNumber1;
		}else {
			tempmin = randomNumber2;
		}
		if(tempmin < randomNumber3){
			min = tempmin;
		}else {
			min = randomNumber3;
		}
		System.out.println("三个随机数中的最小值为：" + min);
	}
}
