package com.seiryo.test.ZD;

public class ZD1 {
	public static void main(String[] args) {
		String str1 = "Seiryo";
		String str2 = "123";
		//�����ַ����ĳ���
		System.out.println(str1.length());
		//�Ƚ������ַ����Ĵ�С
		System.out.println(str1.compareTo(str2));
		//ƴ�������ַ���
		System.out.println(str1.concat(str2));
		//�ж��ַ���ֵ�Ƿ����
		System.out.println(str1.equals(str2));
		//��ȡ�ַ���
		System.out.println(str1.substring(2,5));
		//�������ַ���ת��Ϊ������
		System.out.println(String.valueOf(str2));
	}
}
