package java2_L2;

import java.util.Scanner;

public class LX2 {
	public static void main(String[] args) {
        System.out.println("-----�ܳ����Ƚ�-----");
        System.out.println("����������������");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        int numMore = num1 > num2 ? num1 : num2;
        System.out.println("�ܳ�Ƚϣ�" + numMore + "�ϴ�");

    }
}
