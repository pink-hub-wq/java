package com.edu.seiryo;
/*
 * ��̬������ʵ������������
 */
public class SL4 {
	public static void main(String[] args) {
		SL3 s1 = new SL3();	//ʵ����һ������
		s1.a++;							//ʵ����������
		s1.b++;							//��̬��������
		System.out.println("ʵ������a=" + s1.a);
		System.out.println("��̬����b=" + SL3.b);//����ֱ�ӷ���
		SL3 s2 = new SL3();				//ʵ����һ������
		s2.a++;							//ʵ����������
		s2.b++;							//��̬��������
		System.out.println("ʵ������a=" + s2.a);
		System.out.println("��̬����b=" + SL3.b);//����ֱ�ӷ���
	}
}
