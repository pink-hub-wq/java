package com.seiryo.test.SL;
/**
*concat()����������һ�����ַ���
*/
public class SL4 {
	public static void main(String[] args){
		int a = 100;
		int b = 2;
		//�����ͱ���ת�����ַ�����Ȼ���������
		String strl = String.valueOf (a) + String.valueOf (b);
		//ʹ��concat()������������
		String str2 = String.valueOf(a).concat(String. valueOf(b));
		System.out.println("��һ�����ӷ�ʽ�����" + strl);
		System.out.println("�ڶ������ӷ�ʽ�����" + str2);
	}
}
