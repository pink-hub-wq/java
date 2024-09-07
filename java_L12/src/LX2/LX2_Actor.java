package LX2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class LX2_Actor {
	private LX2_Character character;
	private ArrayList<LX2_Card> handCard = new ArrayList<LX2_Card>();
    public LX2_Actor() {

    }

    public LX2_Actor(LX2_Character character) {
        this.character = character;
    }

    public LX2_Character getCharacter() {
        return character;
    }

    public void setCharacter(LX2_Character character) {
        this.character = character;
    }

    public String toString() {
        return "武将" + character.getName() + "，他的血量是：" + character.getMaxhp() + "，技能是：" + character.getSkillName();
    }
    public void fetchCard(int num) {
        giveCard(num);
    }
    public void giveCard() {
    	if(this instanceof LX2_Player){
            System.out.println("发牌给玩家：" + character.getName());
        } else if (this instanceof LX2_PlayerAI) {
            System.out.println("发牌给对手：" + character.getName());
        }
    }
    public void giveCard(int num) {
    	if(this instanceof LX2_Player){
            System.out.println("发牌给玩家：" + character.getName());
            System.out.println("玩家摸" + num + "张牌后，");
        } else if (this instanceof LX2_PlayerAI) {
            System.out.println("发牌给对手：" + character.getName());
            System.out.println("对手摸" + num + "张牌后，");
        }
            
            for (int i = 0; i < num; i++) {
                LX2_Card card = LX2_Initial.listCard.get(0);
                handCard.add(card);
                LX2_Initial.listCard.remove(0);
            }
    }
    public void showHandCard(){
        Iterator<LX2_Card> it = handCard.iterator();
        System.out.println("\n手牌信息为：");
        while (it.hasNext()){
        	LX2_Card card = it.next();
            System.out.print(card.getColor() + card.getNum() + "[" + card.getKey() + "]\n");
        }
    }
    private boolean hasSomeKill() {
        for (int i = 0; i < handCard.size(); i++) {
            LX2_Card card = handCard.get(i);
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
            Scanner scanner = new Scanner(System.in);
            while (!canSend) {
                try {
                    System.out.println(character.getName() + "，请选择出牌序号：");
                    Scanner sc = new Scanner(System.in);
                    index = sc.nextInt();
                    if(index < 1 || index > handCard.size()){
        				throw new Exception("序号应该在1--" + handCard.size() + "之间");
        			}
                    if (!handCard.get(index - 1).getKey().equals("杀")) {
                        System.out.println("攻击时有杀出杀");
                    } else {
                        canSend = true;
                    }
                } catch (InputMismatchException e1) {
                	e1.printStackTrace();
                    System.out.println("只能输入正整数，请重新输入！");
                    scanner.next();
                } catch (Exception e) {
                	e.printStackTrace();
                    System.out.println("您输入的数据有误：" + e.getMessage());
                }
            }
            if (canSend) {
                LX2_Card card = handCard.remove(index - 1);
                System.out.println(character.getName() + " 出牌：" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
            }
        } else {
            System.out.println(character.getName() + " 没有'杀'牌可出。");
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
        Scanner scanner = new Scanner(System.in);
        while (!canSend) {
            try {
                System.out.println(character.getName() + "请选择要出的闪牌序号：");
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                if(index < 1 || index > handCard.size()){
    				throw new Exception("序号应该在1--" + handCard.size() + "之间");
    			}
                if (!handCard.get(index - 1).getKey().equals("闪")) {
                    System.out.println("回应时请出闪");
                } else {
                    canSend = true;
                }
            } catch (InputMismatchException e1) {
            	e1.printStackTrace();
                System.out.println("只能输入正整数，请重新输入！");
                scanner.next();
            } catch (Exception e) {
                System.out.println("您输入的数据有误：" + e.getMessage());
            }
        }
        if (canSend) {
            LX2_Card card = handCard.remove(index - 1);
            System.out.println(character.getName() + "出牌：" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        }
    }

    private void sendTaoCard() {
        boolean canSend = false;
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        while (!canSend) {
        	try {
        		System.out.println(character.getName() + "请选择要出的桃牌序号：");
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                if(index < 1 || index > handCard.size()){
    				throw new Exception("序号应该在1--" + handCard.size() + "之间");
    			}
                if (!handCard.get(index - 1).getKey().equals("桃")) {
                    System.out.println("请选择要出的桃牌序号：");
                    continue;
                }else {
                	canSend = true;
				}
			} catch (ArrayIndexOutOfBoundsException e1) {
				e1.printStackTrace();
				System.out.println("只能输入正整数且不能超过手牌个数");
				scanner.next();
			}catch (InputMismatchException e2) {
				e2.printStackTrace();
				System.out.println("只能输入正整数且不能超过手牌个数");
				scanner.next();
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("您输入的数据有误");
			}
        }
        if (canSend && index >= 0) {
            sendTaoCard(index);
        }
    }
    private void sendTaoCard(int index) {
        LX2_Card card = handCard.get(index - 1);
        System.out.println(character.getName() + "出牌：" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        handCard.remove(index - 1);
        Random r = new Random();
        int pos = r.nextInt(LX2_Initial.listCard.size());
        LX2_Card newCard = LX2_Initial.listCard.get(pos);
        LX2_Initial.listCard.remove(newCard);
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
        	LX2_Card card = handCard.get(i);
            if (card.getKey().equals("杀")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeShan() {
        for (int i = 0; i < handCard.size(); i++) {
        	LX2_Card card = handCard.get(i);
            if (card.getKey().equals("闪")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeTao() {
        for (int i = 0; i < handCard.size(); i++) {
        	LX2_Card card = handCard.get(i);
            if (card.getKey().equals("桃")) {
                return true;
            }
        }
        return false;
    }

}
