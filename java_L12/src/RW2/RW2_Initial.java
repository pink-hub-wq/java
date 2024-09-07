package RW2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RW2_Initial {
	static RW2_Card[] card = new RW2_Card[104];
    static List<RW2_Card> listCard = new ArrayList<RW2_Card>();
    static RW2_Character[] wujiangs = {
            new RW2_ShuGuoCharacter("刘备", 4, "仁德", 98),
            new RW2_ShuGuoCharacter("关羽", 4, "龙胆", 85),
            new RW2_WeiGuoCharacter("曹操", 4, "奸雄"),
            new RW2_WeiGuoCharacter("夏侯惇", 4, "刚烈"),
            new RW2_WuGuoCharacter("孙权", 4, "制衡"),
            new RW2_WuGuoCharacter("周瑜", 3, "反间")
    };
    public static void cardInit() {
    	for (int i = 0; i < card.length; i++) {
    	    card[i] = new RW2_Card();
    	    if (i % 3 == 0) {
    	        card[i].key = "杀";
    	    } else if (i % 3 == 1) {
    	        card[i].key = "闪";
    	    } else {
    	        card[i].key = "桃";
    	    }
    	}
        int tmp = 0;
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 4; j++) {
                    switch (j) {
                        case 0: card[tmp].setColor("黑桃"); break;
                        case 1: card[tmp].setColor("红桃"); break;
                        case 2: card[tmp].setColor("梅花"); break;
                        case 3: card[tmp].setColor("方块"); break;
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
        System.out.println("武将列表：");
        for (int i = 0; i < wujiangs.length; i++) {
        	System.out.println((i + 1) + "." + wujiangs[i].getName() + "，血量: " + wujiangs[i].getHp() + "，技能：" + wujiangs[i].getSkillName());
            if (wujiangs[i] instanceof RW2_ShuGuoCharacter) {
            	RW2_ShuGuoCharacter sgc = (RW2_ShuGuoCharacter) wujiangs[i];
                System.out.println("，情义：" + sgc.getEmotion());
            }
            System.out.println();
        }
    }

    public static RW2_Actor[] selectWujiang() {
    	boolean flag = false;
    	RW2_Actor[] actors = new RW2_Actor[2];
    	while (!flag) {
    		System.out.println("\n请输入要选择的武将序号：");
    		Scanner sc = new Scanner(System.in);
    		try {
    			int num = sc.nextInt();
    			if(num < 1 || num > wujiangs.length){
    				throw new Exception("序号应该在1--" + wujiangs.length + "之间");
    			}
    			RW2_Actor player = new RW2_Player(wujiangs[num - 1]);
    			System.out.println("玩家选择了" + player.getCharacter().getName() + "进行游戏");
    			actors[0] = player;
    			
    			System.out.println("========================");
    	        System.out.println("请输入你的对手（电脑）武将序号：");
    	        num = sc.nextInt();
    	        RW2_Actor playerAI = new RW2_PlayerAI(wujiangs[num - 1]);
    	        System.out.println("对手选择了" + playerAI.getCharacter().getName() + "进行游戏");
    	        actors[1] = playerAI;
			} catch (InputMismatchException e1) {
				e1.printStackTrace();
				System.out.println("你输入的序号不是正整数，请重新输入");
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("你输入的序号不是正整数，请重新输入");
			}
		}
		return actors;      
    }
    public static void main(String[] args) {
    	showWujiang();
        RW2_Actor[] actors = selectWujiang();
    }
}
