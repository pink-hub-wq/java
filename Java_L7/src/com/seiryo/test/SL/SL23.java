package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * set()����
 */
public class SL23 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		//ָ��ĳ��ĳ��ĳ��
		rightNow.set(2001, 11, 01);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//��ʽ�������
		System.out.println("���õ�����Ϊ��" + sdf.format(rightNow.getTime()));
	}
}
