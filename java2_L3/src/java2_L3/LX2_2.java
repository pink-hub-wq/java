package java2_L3;

import java.util.Scanner;

public class LX2_2 {
	public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("-----�佫�б�-----");
        System.out.print("���� \t ���� \n");
        System.out.print("�ܲ� \t �ĺ \n");
        System.out.print("��Ȩ \t ��� \n");
        String lbName = "����";
        int lbBlood = 4;
        String lbSkill = "�ʵ�";
        String zyName = "����";
        int zyBlood = 4;
        String zySkill = "����";
        String ccName = "�ܲ�";
        int ccBlood = 4;
        String ccSkill = "����";
        String xhdName = "�ĺ";
        int xhdBlood = 4;
        String xhdSkill = "����";
        String sqName = "��Ȩ";
        int sqBlood = 4;
        String sqSkill = "�ƺ�";
        String zyyName = "���";
        int zyyBlood = 5;
        String zyySkill = "����";
        int i = 0;
        System.out.println((++i) + "." + lbName + " \t Ѫ���� " + lbBlood + " \t ���ܣ� " + lbSkill);
        System.out.println((++i) + "." + zyName + " \t Ѫ���� " + zyBlood + " \t ���ܣ� " + zySkill);
        System.out.println((++i) + "." + ccName + " \t Ѫ���� " + ccBlood + " \t ���ܣ� " + ccSkill);
        System.out.println((++i) + "." + xhdName + "\t Ѫ���� " + xhdBlood + " \t ���ܣ� " + xhdSkill);
        System.out.println((++i) + "." + sqName + " \t Ѫ���� " + sqBlood + " \t ���ܣ� " + sqSkill);
        System.out.println((++i) + "." + zyyName + " \t Ѫ���� " + zyyBlood + " \t ���ܣ� " + zyySkill);
        System.out.print("������Ҫѡ����佫��ţ�");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("��ѡ��������������Ϸ");
                break;
            case 2:
                System.out.println("��ѡ�������ƽ�����Ϸ");
                break;
            case 3:
                System.out.println("��ѡ���˲ܲٽ�����Ϸ");
                break;
            case 4:
                System.out.println("��ѡ�����ĺ������Ϸ");
                break;
            case 5:
                System.out.println("��ѡ������Ȩ������Ϸ");
                break;
            case 6:
                System.out.println("��ѡ������褽�����Ϸ");
                break;
        }
        System.out.print("��������Ķ��֣����ԣ�Ҫѡ����佫��ţ�");
        int num2 = sc.nextInt();
        switch (num2){
        case 1:
            System.out.println("����ѡ��������������Ϸ");
            break;
        case 2:
            System.out.println("����ѡ�������ƽ�����Ϸ");
            break;
        case 3:
            System.out.println("����ѡ���˲ܲٽ�����Ϸ");
            break;
        case 4:
            System.out.println("����ѡ�����ĺ������Ϸ");
            break;
        case 5:
            System.out.println("����ѡ������Ȩ������Ϸ");
            break;
        case 6:
            System.out.println("����ѡ������褽�����Ϸ");
            break;
        }
        int cardCount = 104;
        int j = 0;
        while (j < cardCount){
            j++;
        }
        System.out.println("============================");
        System.out.println("���Ƹ������");
        j = 1;
		do {
			System.out.print("[����" +j + "]\t");
		    j++;
			} while (j <= 4);
	    System.out.println("");
        System.out.println("���Ƹ�������");
        j = 1;
        do {
			System.out.print("[����" +j + "]\t");
		    j++;
			} while (j <= 4);
        System.out.println("");
	}
}
