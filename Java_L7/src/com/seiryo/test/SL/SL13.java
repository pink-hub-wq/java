package com.seiryo.test.SL;
/**
 * toString()����
 */
public class SL13 {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(12);
		//toString()�Ǿ�̬����������ͨ������ȥ����
		String s1 = Integer.toString(a);
		String s2 = Integer.toString(b);
		System.out.println(s1 + s2);
	}
}
