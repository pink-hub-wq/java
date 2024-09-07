package RW1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RW1_Initial {
	static RW1_Card[] card = new RW1_Card[104];
    static List<RW1_Card> listCard = new ArrayList<RW1_Card>();
    static RW1_Character[] wujiangs = {
            new RW1_ShuGuoCharacter("刘备", 4, "仁德", 98),
            new RW1_ShuGuoCharacter("关羽", 4, "龙胆", 85),
            new RW1_WeiGuoCharacter("曹操", 4, "奸雄"),
            new RW1_WeiGuoCharacter("夏侯惇", 4, "刚烈"),
            new RW1_WuGuoCharacter("孙权", 4, "制衡"),
            new RW1_WuGuoCharacter("周瑜", 3, "反间")
    };
    public static void cardInit() {
    	for (int i = 0; i < card.length; i++) {
			card[i] = new RW1_Card();
			if(i < 42){
				card[i].key = "杀";
			}else if (i < 42 * 2) {
				card[i].key = "闪";
			}else {
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
            if (wujiangs[i] instanceof RW1_ShuGuoCharacter) {
            	RW1_ShuGuoCharacter sgc = (RW1_ShuGuoCharacter) wujiangs[i];
                System.out.println("，情义：" + sgc.getEmotion());
            }
            System.out.println();
        }
    }

    public static RW1_Actor[] selectWujiang() {
    	RW1_Actor[] actors = new RW1_Actor[2];
    	System.out.println("\n请输入要选择的武将序号：");
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        RW1_Actor player = new RW1_Player(wujiangs[num - 1]);
        System.out.println("玩家选择了" + player.getCharacter().getName() + "进行游戏");
        System.out.println("========================");
        System.out.println("请输入你的对手（电脑）武将序号：");
        num = sc.nextInt();
        RW1_Actor playerAI = new RW1_PlayerAI(wujiangs[num - 1]);
        System.out.println("对手选择了" + playerAI.getCharacter().getName() + "进行游戏");

        actors[0] = player;
        actors[1] = playerAI;

        return actors;
    }
    public static void main(String[] args) {
    	showWujiang();
        RW1_Actor[] actors = selectWujiang();
    }
}
