package com.seiryo.server;
/**
 * ��̬��������̬��������̬�����
 */
public class ZD1 {
	//��̬����
	static int a;
	//��̬�����
	static{
		a = 10;
		System.out.println("��̬����a=" + a);
	}
	//��̬����
	public static void printStatic(int b){
		a = b;
		System.out.println("��̬����a=" + a);
	}
}
