package com.seiryo.test.SJ;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SJ2 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("��ǰ����: " + sdf.format(rightNow.getTime()));
        int hao = rightNow.get(Calendar.DAY_OF_MONTH);
		System.out.println("�����ǣ�" + hao + "��");
		int week = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("���ڣ�" + week);
		System.out.println("���������������������ͬ�����ڣ�");
		 for (int i = 1; i <= 100; i++) {
			 rightNow.add(Calendar.WEEK_OF_YEAR, -1);
            if (rightNow.get(Calendar.DAY_OF_MONTH) == hao && rightNow.get(Calendar.DAY_OF_WEEK) == week ) {
                System.out.println(sdf.format(rightNow.getTime()));
            }
        }
    }
}
