package java_L10;

import java.util.ArrayList;
import java.util.Iterator;

public class LX1_Actor {
	private LX1_Character character;
    private ArrayList<RW1_Card> handCard = new ArrayList<RW1_Card>();

    public LX1_Character getCharacter() {
        return character;
    }

    public void setCharacter(LX1_Character character) {
        this.character = character;
    }

    public ArrayList<RW1_Card> getHandCard() {
        return handCard;
    }

    public void setHandCard(ArrayList<RW1_Card> handCard) {
        this.handCard = handCard;
    }

    public LX1_Actor() {
    }

    public LX1_Actor(LX1_Character character) {
        this.character = character;
    }

    public LX1_Actor(ArrayList<RW1_Card> handCard) {
        this.handCard = handCard;
    }

    @Override
    public String toString() {
        return "武将" + getCharacter().getName() + ",他的血量是：" + getCharacter().getHp() + ",技能是：" + getCharacter().getSkillName();
    }
    
    public void giveCard(){
        if(this instanceof LX1_Player){
            System.out.println("发牌给玩家：" + character.getName());
        } else if (this instanceof LX1_PlaterAI) {
            System.out.println("发牌给对手：" + character.getName());
        }
        for (int i = 0; i < 4; i++) {
            RW1_Card card = RW1_Initial.listCard.get(0);
            System.out.println("[手牌" + (i + 1) + "]" + "\t");
            handCard.add(card);
            RW1_Initial.listCard.remove(0);
        }
    }
    public void showHandCard(){
        Iterator<RW1_Card> it = handCard.iterator();
        System.out.println("\n手牌信息为：");
        while (it.hasNext()){
        	RW1_Card card = it.next();
            System.out.println(card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        }
    }
}
