package com.seiryo.test.SL;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���õ�ʱ���ʽ����ʽ
 */
public class SL18 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("��ǰʱ���ǣ�" + sdf1.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("��ǰʱ���ǣ�" + sdf2.format(date));
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println("��ǰʱ���ǣ�" + sdf3.format(date));
	}
}
