package java_L10;

import java.util.*;

public class RW1_Initial {
	static RW1_Card[] card = new RW1_Card[104];
    static List<RW1_Card> listCard = new ArrayList<RW1_Card>();

    public static void cardInit() {
        for (int i = 0; i < 104; i++) {
            card[i] = new RW1_Card();
            if (i < 42) {
                card[i].key = "ɱ";
            } else if (i < 42 * 2) {
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
                        case 0:
                            card[tmp].setColor("����");
                            break;
                        case 1:
                            card[tmp].setColor("����");
                            break;
                        case 2:
                            card[tmp].setColor("÷��");
                            break;
                        case 3:
                            card[tmp].setColor("����");
                            break;
                    }
                    switch (i) {
                        case 0:
                            card[tmp].setNum("A");
                            break;
                        case 10:
                            card[tmp].setNum("J");
                            break;
                        case 11:
                            card[tmp].setNum("Q");
                            break;
                        case 12:
                            card[tmp].setNum("K");
                            break;
                        default:
                            card[tmp].setNum(java.lang.Integer.toString(i + 1));
                            break;
                    }
                    listCard.add(card[j]);
                    tmp++;
                }
            }
        }
        for (int i = 0; i < card.length; i++) {
            Random r = new Random();
            RW1_Card cardtmp = card[i];
            listCard.remove(cardtmp);
            int index = r.nextInt(listCard.size());
            listCard.add(index, cardtmp);
        }
    }

    public static void showCard() {
        Iterator<RW1_Card> it = listCard.iterator();
        while (it.hasNext()) {
        	RW1_Card card = it.next();
            System.out.println(card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        }
    }
}
