package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Calendar��ĳ�ʼ����getTime()����
 */

public class SL22 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//��ʽ������
		String today = sdf.format(rightNow.getTime());
		System.out.println("�����ǣ�" + today);
		//�޸�����"DATE"������ʾһ�����е�ĳһ�죬"-1"��ʾ��һ��
		rightNow.add(Calendar.DATE, -1);
		String yesterday = sdf.format(rightNow.getTime());
		System.out.println("�����ǣ�" + yesterday);
		
	}
}
