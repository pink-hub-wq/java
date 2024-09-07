package RW1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RW1_Initial {
	static RW1_Card[] card = new RW1_Card[104];
    static List<RW1_Card> listCard = new ArrayList<RW1_Card>();
    static RW1_Character[] wujiangs = {
            new RW1_ShuGuoCharacter("����", 4, "�ʵ�", 98),
            new RW1_ShuGuoCharacter("����", 4, "����", 85),
            new RW1_WeiGuoCharacter("�ܲ�", 4, "����"),
            new RW1_WeiGuoCharacter("�ĺ", 4, "����"),
            new RW1_WuGuoCharacter("��Ȩ", 4, "�ƺ�"),
            new RW1_WuGuoCharacter("���", 3, "����")
    };
    public static void cardInit() {
    	for (int i = 0; i < card.length; i++) {
			card[i] = new RW1_Card();
			if(i < 42){
				card[i].key = "ɱ";
			}else if (i < 42 * 2) {
				card[i].key = "��";
			}else {
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
            if (wujiangs[i] instanceof RW1_ShuGuoCharacter) {
            	RW1_ShuGuoCharacter sgc = (RW1_ShuGuoCharacter) wujiangs[i];
                System.out.println("�����壺" + sgc.getEmotion());
            }
            System.out.println();
        }
    }

    public static RW1_Actor[] selectWujiang() {
    	RW1_Actor[] actors = new RW1_Actor[2];
    	System.out.println("\n������Ҫѡ����佫��ţ�");
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        RW1_Actor player = new RW1_Player(wujiangs[num - 1]);
        System.out.println("���ѡ����" + player.getCharacter().getName() + "������Ϸ");
        System.out.println("========================");
        System.out.println("��������Ķ��֣����ԣ��佫��ţ�");
        num = sc.nextInt();
        RW1_Actor playerAI = new RW1_PlayerAI(wujiangs[num - 1]);
        System.out.println("����ѡ����" + playerAI.getCharacter().getName() + "������Ϸ");

        actors[0] = player;
        actors[1] = playerAI;

        return actors;
    }
    public static void main(String[] args) {
    	showWujiang();
        RW1_Actor[] actors = selectWujiang();
    }
}
