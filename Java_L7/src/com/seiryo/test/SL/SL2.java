package com.seiryo.test.SL;
/**
*length()
*/
public class SL2 {
	public static void main(String[] args) {
	//�����ַ���
	String strl = "Seiryo";
	String str2 = "";
	String str3 = null;
	//length()�������������ͣ�����ַ���Ϊ���򷵻��㡣
	int l1 = strl.length();
	//�ַ���Ϊ��""��ʱ����ʾ�����ڴ�ռ䣬ֻ��ֵΪ�ա�
	int l2 = str2.length();
	/*�ַ���Ϊnullʱ����ʾû�з����ڴ�ռ䣬���Բ��ܼ����䳤��
	*��������"��ָ��"�쳣
	*/
	//int l3 = str3.length();
	System.out.println("str1�ĳ���Ϊ��"+ l1);
	System.out.println("str2�ĳ���Ϊ��"+ l2);
	}
}

