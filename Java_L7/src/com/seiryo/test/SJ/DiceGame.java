package com.seiryo.test.SJ;

public class DiceGame {
	public static Dice dice1 = new Dice();
	public static Dice dice2 = new Dice();
	public static boolean play() {
		dice1.roll();
        System.out.println("第一个筛子数是：" + dice1.getFaceValue());
        dice2.roll();
        System.out.println("第二个筛子数是：" + dice2.getFaceValue());
        int total = dice1.getFaceValue() + dice2.getFaceValue();
		return total == 7;
    }
}

