package RW1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RW1_Actor {
	private RW1_Character character;
	private ArrayList<RW1_Card> handCard = new ArrayList<RW1_Card>();
    public RW1_Actor() {

    }

    public RW1_Actor(RW1_Character character) {
        this.character = character;
    }

    public RW1_Character getCharacter() {
        return character;
    }

    public void setCharacter(RW1_Character character) {
        this.character = character;
    }

    public String toString() {
        return "�佫" + character.getName() + "������Ѫ���ǣ�" + character.getMaxhp() + "�������ǣ�" + character.getSkillName();
    }
    public void fetchCard(int num) {
        giveCard(num);
    }
    public void giveCard() {
    	if(this instanceof RW1_Player){
            System.out.println("���Ƹ���ң�" + character.getName());
        } else if (this instanceof RW1_PlayerAI) {
            System.out.println("���Ƹ����֣�" + character.getName());
        }
    }
    public void giveCard(int num) {
    	if(this instanceof RW1_Player){
            System.out.println("���Ƹ���ң�" + character.getName());
            System.out.println("�����" + num + "���ƺ�");
        } else if (this instanceof RW1_PlayerAI) {
            System.out.println("���Ƹ����֣�" + character.getName());
            System.out.println("������" + num + "���ƺ�");
        }
            
            for (int i = 0; i < num; i++) {
                RW1_Card card = RW1_Initial.listCard.get(0);
                handCard.add(card);
                RW1_Initial.listCard.remove(0);
            }
    }
    public void showHandCard(){
        Iterator<RW1_Card> it = handCard.iterator();
        System.out.println("\n������ϢΪ��");
        while (it.hasNext()){
        	RW1_Card card = it.next();
            System.out.print(card.getColor() + card.getNum() + "[" + card.getKey() + "]\n");
        }
    }
    private boolean hasSomeKill() {
        for (int i = 0; i < handCard.size(); i++) {
            RW1_Card card = handCard.get(i);
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
                RW1_Card card = handCard.get(index - 1);
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
            RW1_Card card = handCard.get(index - 1);
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
        RW1_Card card = handCard.get(index - 1);
        System.out.println(character.getName() + "���ƣ�" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        handCard.remove(index - 1);
        Random r = new Random();
        int pos = r.nextInt(RW1_Initial.listCard.size());
        RW1_Card newCard = RW1_Initial.listCard.get(pos);
        RW1_Initial.listCard.remove(newCard);
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
        	RW1_Card card = handCard.get(i);
            if (card.getKey().equals("ɱ")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeShan() {
        for (int i = 0; i < handCard.size(); i++) {
        	RW1_Card card = handCard.get(i);
            if (card.getKey().equals("��")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeTao() {
        for (int i = 0; i < handCard.size(); i++) {
        	RW1_Card card = handCard.get(i);
            if (card.getKey().equals("��")) {
                return true;
            }
        }
        return false;
    }

}
