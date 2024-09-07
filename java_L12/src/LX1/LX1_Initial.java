package LX1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LX1_Initial {
	static LX1_Card[] card = new LX1_Card[104];
    static List<LX1_Card> listCard = new ArrayList<LX1_Card>();
    static LX1_Character[] wujiangs = {
            new LX1_ShuGuoCharacter("����", 4, "�ʵ�", 98),
            new LX1_ShuGuoCharacter("����", 4, "����", 85),
            new LX1_WeiGuoCharacter("�ܲ�", 4, "����"),
            new LX1_WeiGuoCharacter("�ĺ", 4, "����"),
            new LX1_WuGuoCharacter("��Ȩ", 4, "�ƺ�"),
            new LX1_WuGuoCharacter("���", 3, "����")
    };
    public static void cardInit() {
    	for (int i = 0; i < card.length; i++) {
    	    card[i] = new LX1_Card();
    	    if (i % 3 == 0) {
    	        card[i].key = "ɱ";
    	    } else if (i % 3 == 1) {
    	        card[i].key = "��";
    	    } else {
    	        card[i].key = "��";
    	    }
    	}
        int tmp = 0;
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 4; j++) {
                    switch (j) {
                        case 0: card[tmp].setColor("����"); break;
                        case 1: card[tmp].setColor("����"); break;
                        case 2: card[tmp].setColor("÷��"); break;
                        case 3: card[tmp].setColor("����"); break;
                    }
                    switch (i) {
                        case 0:  card[tmp].setNum("A"); break;
                        case 10: card[tmp].setNum("J"); break;
                        case 11: card[tmp].setNum("Q"); break;
                        case 12: card[tmp].setNum("K"); break;
                        default: card[tmp].setNum(Integer.toString(i + 1)); break;
                    }
                    listCard.add(card[tmp]);
                    tmp++;
                }
            }
        }
    }

    public static void showWujiang() {
        System.out.println("�佫�б�");
        for (int i = 0; i < wujiangs.length; i++) {
        	System.out.println((i + 1) + "." + wujiangs[i].getName() + "��Ѫ��: " + wujiangs[i].getHp() + "�����ܣ�" + wujiangs[i].getSkillName());
            if (wujiangs[i] instanceof LX1_ShuGuoCharacter) {
            	LX1_ShuGuoCharacter sgc = (LX1_ShuGuoCharacter) wujiangs[i];
                System.out.println("�����壺" + sgc.getEmotion());
            }
            System.out.println();
        }
    }

    public static LX1_Actor[] selectWujiang() {
    	boolean flag = false;
    	LX1_Actor[] actors = new LX1_Actor[2];
    	while (!flag) {
    		System.out.println("\n������Ҫѡ����佫��ţ�");
        	Scanner sc = new Scanner(System.in);
    		try {
    			//��ҺͶ���ͬʱ�����쳣����
    			int num = sc.nextInt();
                LX1_Actor player = new LX1_Player(wujiangs[num - 1]);
                System.out.println("���ѡ����" + player.getCharacter().getName() + "������Ϸ");
                actors[0] = player;

                System.out.println("========================");
                System.out.println("��������Ķ��֣����ԣ��佫��ţ�");
                int num2 = sc.nextInt();
                LX1_Actor playerAI = new LX1_PlayerAI(wujiangs[num2 - 1]);
                System.out.println("����ѡ����" + playerAI.getCharacter().getName() + "������Ϸ");
                actors[1] = playerAI;
                
                flag = true;
			} catch (InputMismatchException e1) {
				e1.printStackTrace();
				System.out.println("���������Ų�������������������");
			} catch (ArrayIndexOutOfBoundsException e2) {
				e2.printStackTrace();
				System.out.println("����������Խ�磬����������");
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("�����������쳣��" + e.getMessage());
		}
    }
        return actors;
    }
    public static void main(String[] args) {
    	showWujiang();
        LX1_Actor[] actors = selectWujiang();
    }
}
