package java2_L2;

public class LX1 {
	public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("-----武将列表-----");
        System.out.print("刘备 \t 赵云 \n");
        System.out.print("曹操 \t 夏侯惇 \n");
        System.out.print("孙权 \t 周瑜 \n");
        System.out.println("-----------------");
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
        System.out.println((++i) + "." + zyyName + "\t 血量： " + zyyBlood + " \t 技能： " + zyySkill);
        System.out.println("请输入要选择的武将名字：");
    }
}
