package com.seiryo.test.SL;
/**
*int��Integer֮���ת��
*/
public class SL11 {
	public static void main (String[] args){
	int n = 10;
	Integer in = new Integer (100) ;
	//��int����ת��ΪInteger����Integer 
	Integer inl = new Integer (n);
	//��Integer���͵Ķ���ת��Ϊint����
	int m = in. intValue();
	System.out.println (inl);
	System.out.println(m);
	}
}
