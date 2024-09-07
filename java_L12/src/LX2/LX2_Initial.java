package LX2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LX2_Initial {
	static LX2_Card[] card = new LX2_Card[104];
    static List<LX2_Card> listCard = new ArrayList<LX2_Card>();
    static LX2_Character[] wujiangs = {
            new LX2_ShuGuoCharacter("����", 4, "�ʵ�", 98),
            new LX2_ShuGuoCharacter("����", 4, "����", 85),
            new LX2_WeiGuoCharacter("�ܲ�", 4, "����"),
            new LX2_WeiGuoCharacter("�ĺ", 4, "����"),
            new LX2_WuGuoCharacter("��Ȩ", 4, "�ƺ�"),
            new LX2_WuGuoCharacter("���", 3, "����")
    };
    public static void cardInit() {
    	for (int i = 0; i < card.length; i++) {
    	    card[i] = new LX2_Card();
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
            if (wujiangs[i] instanceof LX2_ShuGuoCharacter) {
            	LX2_ShuGuoCharacter sgc = (LX2_ShuGuoCharacter) wujiangs[i];
                System.out.println("�����壺" + sgc.getEmotion());
            }
            System.out.println();
        }
    }

    public static LX2_Actor[] selectWujiang() {
    	boolean flag = false;
    	LX2_Actor[] actors = new LX2_Actor[2];
    	while (!flag) {
    		System.out.println("\n������Ҫѡ����佫��ţ�");
        	Scanner sc = new Scanner(System.in);
    		try {
    			//��ҺͶ���ͬʱ�����쳣����
    			int num = sc.nextInt();
                LX2_Actor player = new LX2_Player(wujiangs[num - 1]);
                System.out.println("���ѡ����" + player.getCharacter().getName() + "������Ϸ");
                actors[0] = player;

                System.out.println("========================");
                System.out.println("��������Ķ��֣����ԣ��佫��ţ�");
                int num2 = sc.nextInt();
                LX2_Actor playerAI = new LX2_PlayerAI(wujiangs[num2 - 1]);
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
        LX2_Actor[] actors = selectWujiang();
    }
}
