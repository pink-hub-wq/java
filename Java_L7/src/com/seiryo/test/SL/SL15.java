package com.seiryo.test.SL;
/**
 * �Զ�ת��
 */
public class SL15 {
	public static void main(String[] args) {
		//���ؾ���ֵ
		System.out.println("-12�ľ���ֵ��" + Math.abs(-12));
		//�����������������ֵ
		System.out.println("3.3�������������ֵ��" + Math.round(3.3));
		System.out.println("-3.3�������������ֵ��" + Math.round(-3.3));
		//�������������Ľϴ���Сֵ
		System.out.println("5��9�Ľϴ�ֵ��" + Math.max(5, 9));
		System.out.println("5��9�Ľ�Сֵ��" + Math.min(5, 9));
		//������Ȼ����E��Բ����PI��ֵ
		System.out.println("��Ȼ����E��ֵ��" + Math.E);
		System.out.println("Բ����PI��ֵ��" + Math.PI);
		//����10-20֮��������
		System.out.println("������ǣ�" + (int)(Math.random() * 10 + 10));
		//������Ȼ��������
		System.out.println("3������" + Math.exp(3));
	}
}
