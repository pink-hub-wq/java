package com.seiryo.test.SJ;

public class DiceGame {
	public static Dice dice1 = new Dice();
	public static Dice dice2 = new Dice();
	public static boolean play() {
		dice1.roll();
        System.out.println("��һ��ɸ�����ǣ�" + dice1.getFaceValue());
        dice2.roll();
        System.out.println("�ڶ���ɸ�����ǣ�" + dice2.getFaceValue());
        int total = dice1.getFaceValue() + dice2.getFaceValue();
		return total == 7;
    }
}

