package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat���ʹ��
 */
public class SL17 {
	public static void main(String[] args) {
		//ʵ����date����
		Date date = new Date();
		//�Զ����ַ������͸�ʽ
		String formate = "yyyy��MM��dd�� HHʱmm��ss��";
		//ʵ����sdf����
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		//ת����ָ����ʽ���ַ���
		String currentDate = sdf.format(date);
		System.out.println("��ǰʱ���ǣ�" + currentDate );
	}
}
