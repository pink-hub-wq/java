package com.seiryo.test.SL;
/**
*equal s()�������ж϶����Ƿ����
*/
public class SL7 {
	public static void main(String[] args){
		String strl = new String("Seiryo");
		String str2 = new String("Seiryo");
		//"=="�ж����õ�ַ�Ƿ����
		if (strl == str2) {
		System.out.println("�������");
		}else{
		System.out.println("���ò����");
		}
		//�ж�ʵ�ʶ����Ƿ����
		if (strl.equals (str2)) {
		System.out. println("ֵ���");
		}
	}
}
