package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * set()����
 */
public class SL24 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//��ʽ�������
		System.out.println("�����ǣ�" + sdf.format(rightNow.getTime()));
		//"get(Calendar.DAY_PF_WEEK)"��ʾ���ڼ�
		System.out.println("���ڣ�" + rightNow.get(Calendar.DAY_OF_WEEK));
	}
}
