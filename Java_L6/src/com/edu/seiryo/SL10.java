package com.edu.seiryo;

public class SL10 {
	int a = 1;
	static int b = 1;
	//�����
	{
		System.out.println("ʵ������a=" + a);
		System.out.println("�����ִ�У�");
	}
	//��̬�����
	static {
		System.out.println("��̬����b=" + b);
		System.out.println("��̬�����ִ�У�");
	}
	//���췽��
	SL10(){
		System.out.println("���췽��ִ��");
	}
}
