package com.seiryo.test.SL;

import java.util.Calendar;

/**
 *Calendar������getTime()����
 */
public class SL21 {
	public static void main(String[] args) {
		//��ȡCalendar��Ķ���righrNow
		Calendar rightNow = Calendar.getInstance();
		//ʹ��getTime()�������ص�ǰ��ʱ��
		System.out.println("��ǰʱ�䣺" + rightNow.getTime());
	}
}
