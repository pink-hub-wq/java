package RW2andLX2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RW2_Actor {
	private RW2_Character character;
	private ArrayList<RW2_Card> handCard = new ArrayList<RW2_Card>();
    public RW2_Actor() {

    }

    public RW2_Actor(RW2_Character character) {
        this.character = character;
    }

    public RW2_Character getCharacter() {
        return character;
    }

    public void setCharacter(RW2_Character character) {
        this.character = character;
    }

    public String toString() {
        return "�佫" + character.getName() + "������Ѫ���ǣ�" + character.getMaxhp() + "�������ǣ�" + character.getSkillName();
    }
    public void fetchCard(int num) {
        giveCard(num);
    }
    public void giveCard() {
    	if(this instanceof RW2_Player){
            System.out.println("���Ƹ���ң�" + character.getName());
        } else if (this instanceof RW2_PlayerAI) {
            System.out.println("���Ƹ����֣�" + character.getName());
        }
    }
    public void giveCard(int num) {
    	if(this instanceof RW2_Player){
            System.out.println("���Ƹ���ң�" + character.getName());
            System.out.println("�����" + num + "���ƺ�");
        } else if (this instanceof RW2_PlayerAI) {
            System.out.println("���Ƹ����֣�" + character.getName());
            System.out.println("������" + num + "���ƺ�");
        }
            
            for (int i = 0; i < num; i++) {
                RW2_Card card = RW2_Initial.listCard.get(0);
                handCard.add(card);
                RW2_Initial.listCard.remove(0);
            }
    }
    public void showHandCard(){
        Iterator<RW2_Card> it = handCard.iterator();
        System.out.println("\n������ϢΪ��");
        while (it.hasNext()){
        	RW2_Card card = it.next();
            System.out.print(card.getColor() + card.getNum() + "[" + card.getKey() + "]\n");
        }
    }
    private boolean hasSomeKill() {
        for (int i = 0; i < handCard.size(); i++) {
            RW2_Card card = handCard.get(i);
            if (card.getKey().equals("ɱ")) {
                return true;
            }
        }
        return false;
    }
    public void sendShaCard() {
        if (hasSomeKill()) {
            boolean canSend = false;
            int index = -1;
            while (!canSend) {
                System.out.println(character.getName() + "����ѡ�������ţ�");
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                if (!handCard.get(index - 1).getKey().equals("ɱ")) {
                    System.out.println("����ʱ��ɱ��ɱ");
                    continue;
                }
                canSend = true;
            }
            if (canSend && index >= 0) {
                RW2_Card card = handCard.get(index - 1);
                System.out.println(character.getName() + " ���ƣ�" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
                handCard.remove(card);
            }
        }
    }
    public void sendReplyCard() {
        if (hasSomeShan()) {
            System.out.println("������");
            sendShanCard();
        } else if (hasSomeTao()) {
            System.out.println("������");
            sendTaoCard();
        }
    }
    private void sendShanCard() {
        boolean canSend = false;
        int index = -1;
        while (!canSend) {
            System.out.println(character.getName() + "��ѡ��Ҫ����������ţ�");
            Scanner sc = new Scanner(System.in);
            index = sc.nextInt();
            if (!handCard.get(index - 1).getKey().equals("��")) {
                System.out.println("��Ӧʱ��������");
                continue;
            }
            canSend = true;
        }
        if (canSend && index >= 0) {
            RW2_Card card = handCard.get(index - 1);
            System.out.println(character.getName() + "���ƣ�" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
            handCard.remove(card);
        }
    }
    private void sendTaoCard() {
        boolean canSend = false;
        int index = -1;
        while (!canSend) {
            System.out.println(character.getName() + "��ѡ��Ҫ����������ţ�");
            Scanner sc = new Scanner(System.in);
            index = sc.nextInt();
            if (!handCard.get(index - 1).getKey().equals("��")) {
                System.out.println("��ѡ��Ҫ����������ţ�");
                continue;
            }
            canSend = true;
        }
        if (canSend && index >= 0) {
            sendTaoCard(index);
        }
    }
    private void sendTaoCard(int index) {
        RW2_Card card = handCard.get(index - 1);
        System.out.println(character.getName() + "���ƣ�" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        handCard.remove(index - 1);
        Random r = new Random();
        int pos = r.nextInt(RW2_Initial.listCard.size());
        RW2_Card newCard = RW2_Initial.listCard.get(pos);
        RW2_Initial.listCard.remove(newCard);
        handCard.add(newCard);
        if (!newCard.getKey().equals("��")) {
            if (hasSomeTao()) {
                sendTaoCard();
            } else {
                sendShanCard();
            }
        }
    }
    private boolean hasFullKill(){
    	return false;
    }
    private boolean hasSomeSha() {
        for (int i = 0; i < handCard.size(); i++) {
        	RW2_Card card = handCard.get(i);
            if (card.getKey().equals("ɱ")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeShan() {
        for (int i = 0; i < handCard.size(); i++) {
        	RW2_Card card = handCard.get(i);
            if (card.getKey().equals("��")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeTao() {
        for (int i = 0; i < handCard.size(); i++) {
        	RW2_Card card = handCard.get(i);
            if (card.getKey().equals("��")) {
                return true;
            }
        }
        return false;
    }

}
