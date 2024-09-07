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
        return "�佫" + character.getName() + "������Ѫ���ǣ�" + character.getMaxhp() + "�������ǣ�" + character.getSkillName();
    }
    public void fetchCard(int num) {
        giveCard(num);
    }
    public void giveCard() {
    	if(this instanceof LX2_Player){
            System.out.println("���Ƹ���ң�" + character.getName());
        } else if (this instanceof LX2_PlayerAI) {
            System.out.println("���Ƹ����֣�" + character.getName());
        }
    }
    public void giveCard(int num) {
    	if(this instanceof LX2_Player){
            System.out.println("���Ƹ���ң�" + character.getName());
            System.out.println("�����" + num + "���ƺ�");
        } else if (this instanceof LX2_PlayerAI) {
            System.out.println("���Ƹ����֣�" + character.getName());
            System.out.println("������" + num + "���ƺ�");
        }
            
            for (int i = 0; i < num; i++) {
                LX2_Card card = LX2_Initial.listCard.get(0);
                handCard.add(card);
                LX2_Initial.listCard.remove(0);
            }
    }
    public void showHandCard(){
        Iterator<LX2_Card> it = handCard.iterator();
        System.out.println("\n������ϢΪ��");
        while (it.hasNext()){
        	LX2_Card card = it.next();
            System.out.print(card.getColor() + card.getNum() + "[" + card.getKey() + "]\n");
        }
    }
    private boolean hasSomeKill() {
        for (int i = 0; i < handCard.size(); i++) {
            LX2_Card card = handCard.get(i);
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
            Scanner scanner = new Scanner(System.in);
            while (!canSend) {
                try {
                    System.out.println(character.getName() + "����ѡ�������ţ�");
                    Scanner sc = new Scanner(System.in);
                    index = sc.nextInt();
                    if(index < 1 || index > handCard.size()){
        				throw new Exception("���Ӧ����1--" + handCard.size() + "֮��");
        			}
                    if (!handCard.get(index - 1).getKey().equals("ɱ")) {
                        System.out.println("����ʱ��ɱ��ɱ");
                    } else {
                        canSend = true;
                    }
                } catch (InputMismatchException e1) {
                	e1.printStackTrace();
                    System.out.println("ֻ�����������������������룡");
                    scanner.next();
                } catch (Exception e) {
                	e.printStackTrace();
                    System.out.println("���������������" + e.getMessage());
                }
            }
            if (canSend) {
                LX2_Card card = handCard.remove(index - 1);
                System.out.println(character.getName() + " ���ƣ�" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
            }
        } else {
            System.out.println(character.getName() + " û��'ɱ'�ƿɳ���");
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
        Scanner scanner = new Scanner(System.in);
        while (!canSend) {
            try {
                System.out.println(character.getName() + "��ѡ��Ҫ����������ţ�");
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                if(index < 1 || index > handCard.size()){
    				throw new Exception("���Ӧ����1--" + handCard.size() + "֮��");
    			}
                if (!handCard.get(index - 1).getKey().equals("��")) {
                    System.out.println("��Ӧʱ�����");
                } else {
                    canSend = true;
                }
            } catch (InputMismatchException e1) {
            	e1.printStackTrace();
                System.out.println("ֻ�����������������������룡");
                scanner.next();
            } catch (Exception e) {
                System.out.println("���������������" + e.getMessage());
            }
        }
        if (canSend) {
            LX2_Card card = handCard.remove(index - 1);
            System.out.println(character.getName() + "���ƣ�" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        }
    }

    private void sendTaoCard() {
        boolean canSend = false;
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        while (!canSend) {
        	try {
        		System.out.println(character.getName() + "��ѡ��Ҫ����������ţ�");
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                if(index < 1 || index > handCard.size()){
    				throw new Exception("���Ӧ����1--" + handCard.size() + "֮��");
    			}
                if (!handCard.get(index - 1).getKey().equals("��")) {
                    System.out.println("��ѡ��Ҫ����������ţ�");
                    continue;
                }else {
                	canSend = true;
				}
			} catch (ArrayIndexOutOfBoundsException e1) {
				e1.printStackTrace();
				System.out.println("ֻ�������������Ҳ��ܳ������Ƹ���");
				scanner.next();
			}catch (InputMismatchException e2) {
				e2.printStackTrace();
				System.out.println("ֻ�������������Ҳ��ܳ������Ƹ���");
				scanner.next();
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("���������������");
			}
        }
        if (canSend && index >= 0) {
            sendTaoCard(index);
        }
    }
    private void sendTaoCard(int index) {
        LX2_Card card = handCard.get(index - 1);
        System.out.println(character.getName() + "���ƣ�" + card.getColor() + card.getNum() + "[" + card.getKey() + "]");
        handCard.remove(index - 1);
        Random r = new Random();
        int pos = r.nextInt(LX2_Initial.listCard.size());
        LX2_Card newCard = LX2_Initial.listCard.get(pos);
        LX2_Initial.listCard.remove(newCard);
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
        	LX2_Card card = handCard.get(i);
            if (card.getKey().equals("ɱ")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeShan() {
        for (int i = 0; i < handCard.size(); i++) {
        	LX2_Card card = handCard.get(i);
            if (card.getKey().equals("��")) {
                return true;
            }
        }
        return false;
    }
    private boolean hasSomeTao() {
        for (int i = 0; i < handCard.size(); i++) {
        	LX2_Card card = handCard.get(i);
            if (card.getKey().equals("��")) {
                return true;
            }
        }
        return false;
    }

}
