package LX1;

import java.util.ArrayList;
import java.util.Iterator;

public class LX1_Actor {
	private LX1_Character character;
	private ArrayList<LX1_Card> handCard = new ArrayList<LX1_Card>();
    public LX1_Actor() {

    }

    public LX1_Actor(LX1_Character character) {
        this.character = character;
    }

    public LX1_Character getCharacter() {
        return character;
    }

    public void setCharacter(LX1_Character character) {
        this.character = character;
    }

    public String toString() {
        return "武将" + character.getName() + "，他的血量是：" + character.getMaxhp() + "，技能是：" + character.getSkillName();
    }
    public void fetchCard(int num) {
        giveCard(num);
    }
    public void giveCard() {
    	if(this instanceof LX1_Player){
            System.out.println("发牌给玩家：" + character.getName());
        } else if (this instanceof LX1_PlayerAI) {
            System.out.println("发牌给对手：" + character.getName());
        }
    }
    public void giveCard(int num) {
    	if(this instanceof LX1_Player){
            System.out.println("发牌给玩家：" + character.getName());
            System.out.println("玩家摸" + num + "张牌后，");
        } else if (this instanceof LX1_PlayerAI) {
            System.out.println("发牌给对手：" + character.getName());
            System.out.println("对手摸" + num + "张牌后，");
        }
    	
            for (int i = 0; i < num; i++) {
                LX1_Card card = LX1_Initial.listCard.get(0);
                handCard.add(card);
                LX1_Initial.listCard.remove(0);
            }
    }
    public void showHandCard(){
        Iterator<LX1_Card> it = handCard.iterator();
        System.out.println("\n手牌信息为：");
        while (it.hasNext()){
        	LX1_Card card = it.next();
            System.out.print(card.getColor() + card.getNum() + "[" + card.getKey() + "]\n");
        }
    }
}
