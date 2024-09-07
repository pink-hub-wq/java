package RW2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RW2_Initial {
	static RW2_Card[] card = new RW2_Card[104];
    static List<RW2_Card> listCard = new ArrayList<RW2_Card>();
    static RW2_Character[] wujiangs = {
            new RW2_ShuGuoCharacter("����", 4, "�ʵ�", 98),
            new RW2_ShuGuoCharacter("����", 4, "����", 85),
            new RW2_WeiGuoCharacter("�ܲ�", 4, "����"),
            new RW2_WeiGuoCharacter("�ĺ", 4, "����"),
            new RW2_WuGuoCharacter("��Ȩ", 4, "�ƺ�"),
            new RW2_WuGuoCharacter("���", 3, "����")
    };
    public static void cardInit() {
    	for (int i = 0; i < card.length; i++) {
    	    card[i] = new RW2_Card();
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
            if (wujiangs[i] instanceof RW2_ShuGuoCharacter) {
            	RW2_ShuGuoCharacter sgc = (RW2_ShuGuoCharacter) wujiangs[i];
                System.out.println("�����壺" + sgc.getEmotion());
            }
            System.out.println();
        }
    }

    public static RW2_Actor[] selectWujiang() {
    	boolean flag = false;
    	RW2_Actor[] actors = new RW2_Actor[2];
    	while (!flag) {
    		System.out.println("\n������Ҫѡ����佫��ţ�");
    		Scanner sc = new Scanner(System.in);
    		try {
    			int num = sc.nextInt();
    			if(num < 1 || num > wujiangs.length){
    				throw new Exception("���Ӧ����1--" + wujiangs.length + "֮��");
    			}
    			RW2_Actor player = new RW2_Player(wujiangs[num - 1]);
    			System.out.println("���ѡ����" + player.getCharacter().getName() + "������Ϸ");
    			actors[0] = player;
    			
    			System.out.println("========================");
    	        System.out.println("��������Ķ��֣����ԣ��佫��ţ�");
    	        num = sc.nextInt();
    	        RW2_Actor playerAI = new RW2_PlayerAI(wujiangs[num - 1]);
    	        System.out.println("����ѡ����" + playerAI.getCharacter().getName() + "������Ϸ");
    	        actors[1] = playerAI;
			} catch (InputMismatchException e1) {
				e1.printStackTrace();
				System.out.println("���������Ų���������������������");
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("���������Ų���������������������");
			}
		}
		return actors;      
    }
    public static void main(String[] args) {
    	showWujiang();
        RW2_Actor[] actors = selectWujiang();
    }
}
