package java_L12;

import java.util.Scanner;

public class SL8_Test {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int[] arr = new int[3];
	     try {
	         for (int i = 0; i < arr.length; i++) {
	             System.out.println("�������" + (i + 1) + "���˵����䣺");
	             arr[i] = sc.nextInt();
	             if (arr[i] < 0 || arr[i] > 100) {
	                 throw new SL8_MyException("������ĵ�" + (i + 1) + "����ֵ����0~100��Χ��");
	             }
	         }
	     } catch (SL8_MyException e) {
	         e.printStackTrace();
	     } catch (Exception e) {
	         e.printStackTrace(); 
	     }
	 }
}
