package com.seiryo.server;

public class LX1{
    //��̬����
	static int a;
	//��̬����
	public static void staticMethod(){
		System.out.println("��̬����ִ��");
	}
	//��̬�����
	static{
			System.out.println("��̬�����ִ��");
	}
	//���췽��
	public LX1(){
		System.out.println("���췽��ִ��");
	}
	//�Ǿ�̬�����
	{
		System.out.println("�Ǿ�̬�����ִ��");
	}
	//�Ǿ�̬����
	public void killNiu(){
		System.out.println("killNiu����ִ��");
	}
}