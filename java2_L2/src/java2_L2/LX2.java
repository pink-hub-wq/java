package java2_L2;

import java.util.Scanner;

public class LX2 {
	public static void main(String[] args) {
        System.out.println("-----曹冲来比较-----");
        System.out.println("请输入两个整数：");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        int numMore = num1 > num2 ? num1 : num2;
        System.out.println("曹冲比较：" + numMore + "较大");

    }
}
