package java2_L4;

import java.util.Scanner;

public class LX2 {
	public static void main(String[] args) {
        String [] [] wujiangArray = {{"����","4","�ʵ�"},{"����","4","����"},{"�ܲ�","4","����"},{"�ĺ","4","����"},{"��Ȩ","4","�ƺ�"},{"���","3","����"}};
        for (int i = 0; i < wujiangArray.length; i++) {
            System.out.println((i + 1) + "." + wujiangArray[i][0] + "\t Ѫ����" + wujiangArray[i][1] + "\t ���ܣ�" + wujiangArray[i][2]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("����������ѡ����佫��ţ�");
        int num1 = sc.nextInt();
        switch (num1){
            case 1:
                System.out.println(wujiangArray[0][0]);
                break;
            case 2:
                System.out.println(wujiangArray[1][0]);
                break;
            case 3:
                System.out.println(wujiangArray[2][0]);
                break;
            case 4:
                System.out.println(wujiangArray[3][0]);
                break;
            case 5:
                System.out.println(wujiangArray[4][0]);
                break;
            case 6:
                System.out.println(wujiangArray[5][0]);
                break;
            default:
                System.out.println("�����������");
        }
        System.out.print("��������Ķ��֣����ԣ����佫��ţ�");
        int num2 = sc.nextInt();
        switch (num2){
            case 1:
                System.out.println(wujiangArray[0][0]);
                break;
            case 2:
                System.out.println(wujiangArray[1][0]);
                break;
            case 3:
                System.out.println(wujiangArray[2][0]);
                break;
            case 4:
                System.out.println(wujiangArray[3][0]);
                break;
            case 5:
                System.out.println(wujiangArray[4][0]);
                break;
            case 6:
                System.out.println(wujiangArray[5][0]);
                break;
            default:
                System.out.println("�����������");
        }
    }
}
