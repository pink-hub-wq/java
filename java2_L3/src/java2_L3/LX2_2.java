package java2_L3;

import java.util.Scanner;

public class LX2_2 {
	public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("-----武将列表-----");
        System.out.print("刘备 \t 赵云 \n");
        System.out.print("曹操 \t 夏侯惇 \n");
        System.out.print("孙权 \t 周瑜 \n");
        String lbName = "刘备";
        int lbBlood = 4;
        String lbSkill = "仁德";
        String zyName = "赵云";
        int zyBlood = 4;
        String zySkill = "龙胆";
        String ccName = "曹操";
        int ccBlood = 4;
        String ccSkill = "奸雄";
        String xhdName = "夏侯惇";
        int xhdBlood = 4;
        String xhdSkill = "刚烈";
        String sqName = "孙权";
        int sqBlood = 4;
        String sqSkill = "制衡";
        String zyyName = "周瑜";
        int zyyBlood = 5;
        String zyySkill = "反间";
        int i = 0;
        System.out.println((++i) + "." + lbName + " \t 血量： " + lbBlood + " \t 技能： " + lbSkill);
        System.out.println((++i) + "." + zyName + " \t 血量： " + zyBlood + " \t 技能： " + zySkill);
        System.out.println((++i) + "." + ccName + " \t 血量： " + ccBlood + " \t 技能： " + ccSkill);
        System.out.println((++i) + "." + xhdName + "\t 血量： " + xhdBlood + " \t 技能： " + xhdSkill);
        System.out.println((++i) + "." + sqName + " \t 血量： " + sqBlood + " \t 技能： " + sqSkill);
        System.out.println((++i) + "." + zyyName + " \t 血量： " + zyyBlood + " \t 技能： " + zyySkill);
        System.out.print("请输入要选择的武将序号：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("你选择了刘备进行游戏");
                break;
            case 2:
                System.out.println("你选择了赵云进行游戏");
                break;
            case 3:
                System.out.println("你选择了曹操进行游戏");
                break;
            case 4:
                System.out.println("你选择了夏侯惇进行游戏");
                break;
            case 5:
                System.out.println("你选择了孙权进行游戏");
                break;
            case 6:
                System.out.println("你选择了周瑜进行游戏");
                break;
        }
        System.out.print("请输入你的对手（电脑）要选择的武将序号：");
        int num2 = sc.nextInt();
        switch (num2){
        case 1:
            System.out.println("对手选择了刘备进行游戏");
            break;
        case 2:
            System.out.println("对手选择了赵云进行游戏");
            break;
        case 3:
            System.out.println("对手选择了曹操进行游戏");
            break;
        case 4:
            System.out.println("对手选择了夏侯惇进行游戏");
            break;
        case 5:
            System.out.println("对手选择了孙权进行游戏");
            break;
        case 6:
            System.out.println("对手选择了周瑜进行游戏");
            break;
        }
        int cardCount = 104;
        int j = 0;
        while (j < cardCount){
            j++;
        }
        System.out.println("============================");
        System.out.println("发牌给：玩家");
        j = 1;
		do {
			System.out.print("[卡牌" +j + "]\t");
		    j++;
			} while (j <= 4);
	    System.out.println("");
        System.out.println("发牌给：对手");
        j = 1;
        do {
			System.out.print("[卡牌" +j + "]\t");
		    j++;
			} while (j <= 4);
        System.out.println("");
	}
}
