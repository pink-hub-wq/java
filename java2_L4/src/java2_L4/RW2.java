package java2_L4;

public class RW2 {
	public static void main(String[] args) {
        String [] [] wujiangArray = {{"刘备","4","仁德"},{"赵云","4","龙胆"},{"曹操","4","奸雄"},{"夏侯惇","4","刚烈"},{"孙权","4","制衡"},{"周瑜","3","反间"}};
        for (int i = 0; i < wujiangArray.length; i++) {
            System.out.println((i + 1) + "." + wujiangArray[i][0] + "\t 血量：" + wujiangArray[i][1] + "\t 技能：" + wujiangArray[i][2]);
        }
    }
}
