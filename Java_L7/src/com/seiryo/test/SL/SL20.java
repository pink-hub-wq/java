package com.seiryo.test.SL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ַ���ת��Ϊʱ������
 */
public class SL20 {
	public static void main(String[] args) throws ParseException {
		//�û������ʱ��
		String birthday = "1986-04-07";
		//��ʽ����׼
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//parse()�������ַ���ת��Ϊint����
		Date d = sdf.parse(birthday);
		System.out.println("ת����Date���͵�ʱ���ǣ�" + d);
	}
}
