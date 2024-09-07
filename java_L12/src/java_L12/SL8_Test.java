package java_L12;

import java.util.Scanner;

public class SL8_Test {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int[] arr = new int[3];
	     try {
	         for (int i = 0; i < arr.length; i++) {
	             System.out.println("请输入第" + (i + 1) + "个人的年龄：");
	             arr[i] = sc.nextInt();
	             if (arr[i] < 0 || arr[i] > 100) {
	                 throw new SL8_MyException("您输入的第" + (i + 1) + "个数值不在0~100范围内");
	             }
	         }
	     } catch (SL8_MyException e) {
	         e.printStackTrace();
	     } catch (Exception e) {
	         e.printStackTrace(); 
	     }
	 }
}
