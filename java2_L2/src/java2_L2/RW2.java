package java2_L2;

import java.util.Scanner;

public class RW2 {
	public static void main(String[] args) {
        System.out.println("-----�ܳ�������-----");
        System.out.println("����������������");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        System.out.println("�ܳ����ӷ���" + num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println("�ܳ���������" + num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println("�ܳ����˷���" + num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println("�ܳ���������" + num1 + "/" + num2 + "=" + Math.round(num1 * 100 / num2) / 100);
    }
}
