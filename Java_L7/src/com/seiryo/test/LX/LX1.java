package com.seiryo.test.LX;

public class LX1 {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("I love");
		StringBuffer str2 = new StringBuffer(" Seiryo");
		System.out.println(str1.append(str2));
		StringBuffer str3 = new StringBuffer("I  Seiryo");
		StringBuffer str4 = new StringBuffer("love");
		System.out.println(str3.insert(2, str4));
	}
}
