package com.seiryo.test.SL;
/**
*insert()��������ָ��λ�ò����ַ���
*/
public class SL10 {
	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Seiryo");
	//������λ���ϲ���"123"��λ���±��0��ʼ
	sb.insert (2, "123");
	System.out.println(sb);
	}
}