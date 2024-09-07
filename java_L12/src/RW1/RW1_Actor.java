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
        return "武将" + character.getName() + "，他的血量是：" + character.getMaxhp() + "，技能是：" + character.getSkillName();
    }
    public void fetchCard(int num) {
        giveCard(num);
    }
    public void giveCard() {
    	if(this instanceof RW1_Player){
            System.out.println("发牌给玩家：" + character.getName());
        } else if (this instanceof RW1_PlayerAI) {
            System.out.println("发牌给对手：" + character.getName());
        }
    }
    public void giveCard(int num) {
    	if(this instanceof RW1_Player){
            System.out.println("发牌给玩家：" + character.getName());
            System.out.println("玩家摸" + num + "张牌后，");
        } else if (this instanceof RW1_PlayerAI) {
            System.out.println("发牌给对手：" + character.getName());
            System.out.println("对手摸" + num + "张牌后，");
        }
            
            for (int i = 0; i < num; i++) {
                RW1_Card card = RW1_Initial.listCard.get(0);
                handCard.add(card);
                RW1_Initial.listCard.remove(0);
            }
    }
    public void showHandCard(){
        Iterator<RW1_Card> it = handCard.iterator();
        System.out.println("\n手牌信息为：");
        while (it.hasNext()){
        	RW1_Card card = it.next();
            System.out.print(card.getColor() + card.getNum() + "[" + card.getKey() + "]\n");
        }
    }
    private boolean hasSomeKill() {
        for (int i = 0; i < handCard.size(); i++) {
            RW1_Card card = handCard.get(i);
            if (card.getKey().equals("杀")) {
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
                System.out.println(character.getName() + "，请选择出牌序号：");
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                if (!handCard.get(index - 1).getKey().equals("杀")) {
                    System.out.println("攻击时有杀出杀");
                    continue;
                }
                canSend = true;
            }
            if (canSend && index >= 0) {
                RW1_Card card = handCard.get(index - 1);
                System.out.println(character.getName() + " 出牌：" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
                handCard.remove(card);
            }
        }
    }
    public void sendReplyCard() {
        if (hasSomeShan()) {
            System.out.println("有闪牌");
            sendShanCard();
        } else if (hasSomeTao()) {
            System.out.println("有桃牌");
            sendTaoCard();
        }
    }
    private void sendShanCard() {
        boolean canSend = false;
        int index = -1;
        while (!canSend) {
            System.out.println(character.getName() + "请选择要出的闪牌序号：");
            Scanner sc = new Scanner(System.in);
            index = sc.nextInt();
            if (!handCard.get(index - 1).getKey().equals("闪")) {
                System.out.println("回应时有闪出闪");
                continue;
            }
            canSend = true;
        }
        if (canSend && index >= 0) {
            RW1_Card card = handCard.get(index - 1);
            System.out.println(character.getName() + "出牌：" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
            handCard.remove(card);
        }
    }
    private void sendTaoCard() {
        boolean canSend = false;
        int index = -1;
        while (!canSend) {
            System.out.println(character.getName() + "请选择要出的桃牌序号：");
            Scanner sc = new Scanner(System.in);
            index = sc.nextInt();
            if (!handCard.get(index - 1).getKey().equals("桃")) {
                System.out.println("请选择要出的桃牌序号：");
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
        System.out.println(character.getName() + "出牌：" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        handCard.remove(index - 1);
        Random r = new Random();
        int pos = r.nextInt(RW1_Initial.listCard.size());
        RW1_Card newCard = RW1_Initial.listCard.get(pos);
        RW1_Initial.listCard.remove(newCard);
        handCard.add(newCard);
        if (!newCard.getKey().equals("闪")) {
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
            if (card.getKey().equals("杀")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeShan() {
        for (int i = 0; i < handCard.size(); i++) {
        	RW1_Card card = handCard.get(i);
            if (card.getKey().equals("闪")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeTao() {
        for (int i = 0; i < handCard.size(); i++) {
        	RW1_Card card = handCard.get(i);
            if (card.getKey().equals("桃")) {
                return true;
            }
        }
        return false;
    }

}
