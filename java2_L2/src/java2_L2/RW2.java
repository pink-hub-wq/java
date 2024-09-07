package java2_L2;

import java.util.Scanner;

public class RW2 {
	public static void main(String[] args) {
        System.out.println("-----曹冲来计算-----");
        System.out.println("请输入两个整数：");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        System.out.println("曹冲计算加法：" + num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println("曹冲计算减法：" + num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println("曹冲计算乘法：" + num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println("曹冲计算除法：" + num1 + "/" + num2 + "=" + Math.round(num1 * 100 / num2) / 100);
    }
}
