package com.sanguosha.entity;

import java.util.Scanner;

public class LX1_3 {
    public static String[][] wujiangArray = new String[6][3];

    public static void startGame() {
        System.out.println("=====��ӭ�������������ɱ=====");
        LX1_3.line();
        System.out.println("����ɱ��һ�����������Ϊ����������");
        System.out.println("���������ɱ��һ����Java�����Ŀ���̨��Ϸ����");
        System.out.println("===========================");
        System.out.println("----------�佫�б�----------");
        wujiangArray[0][0] = "����";
        wujiangArray[0][1] = "4";
        wujiangArray[0][2] = "�ʵ�";
        wujiangArray[1][0] = "����";
        wujiangArray[1][1] = "4";
        wujiangArray[1][2] = "����";
        wujiangArray[2][0] = "�ܲ�";
        wujiangArray[2][1] = "4";
        wujiangArray[2][2] = "����";
        wujiangArray[3][0] = "�ĺ";
        wujiangArray[3][1] = "4";
        wujiangArray[3][2] = "����";
        wujiangArray[4][0] = "��Ȩ";
        wujiangArray[4][1] = "4";
        wujiangArray[4][2] = "�ƺ�";
        wujiangArray[5][0] = "���";
        wujiangArray[5][1] = "3";
        wujiangArray[5][2] = "����";
        for (int i = 0; i < wujiangArray.length; i++) {
            System.out.println((i + 1) + "." + wujiangArray[i][0] + "\tѪ����" + wujiangArray[i][1] + "\t���ܣ�" + wujiangArray[i][2]);
        }
    }

    public static LX1_1 player = null;

    public static void selectWujiang() {
        LX1_3.line();
        System.out.print("������Ҫѡ����佫��ţ�");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < wujiangArray.length; i++) {
            if ((i + 1) == num) {
                LX1_1 character = new LX1_1();
                character.setName(wujiangArray[i][0]);
                character.setMaxhp(Integer.parseInt(wujiangArray[i][1]));
                character.setSkill(wujiangArray[i][2]);
                LX1_2 player = new LX1_2();
                player.setCharacter(character);
                player.setType("���");
                player.setHp(character.getMaxhp());
                System.out.println(player.getType() + "ѡ����" + player.getCharacter().getName() + "������Ϸ");
            }
        }
    }

    private static void line() {
        System.out.println("============================");
    }

}
