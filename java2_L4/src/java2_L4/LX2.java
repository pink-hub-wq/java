package java2_L4;

import java.util.Scanner;

public class LX2 {
	public static void main(String[] args) {
        String [] [] wujiangArray = {{"刘备","4","仁德"},{"赵云","4","龙胆"},{"曹操","4","奸雄"},{"夏侯惇","4","刚烈"},{"孙权","4","制衡"},{"周瑜","3","反间"}};
        for (int i = 0; i < wujiangArray.length; i++) {
            System.out.println((i + 1) + "." + wujiangArray[i][0] + "\t 血量：" + wujiangArray[i][1] + "\t 技能：" + wujiangArray[i][2]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想选择的武将序号：");
        int num1 = sc.nextInt();
        switch (num1){
            case 1:
                System.out.println(wujiangArray[0][0]);
                break;
            case 2:
                System.out.println(wujiangArray[1][0]);
                break;
            case 3:
                System.out.println(wujiangArray[2][0]);
                break;
            case 4:
                System.out.println(wujiangArray[3][0]);
                break;
            case 5:
                System.out.println(wujiangArray[4][0]);
                break;
            case 6:
                System.out.println(wujiangArray[5][0]);
                break;
            default:
                System.out.println("你的输入有误！");
        }
        System.out.print("请输入你的对手（电脑）的武将序号：");
        int num2 = sc.nextInt();
        switch (num2){
            case 1:
                System.out.println(wujiangArray[0][0]);
                break;
            case 2:
                System.out.println(wujiangArray[1][0]);
                break;
            case 3:
                System.out.println(wujiangArray[2][0]);
                break;
            case 4:
                System.out.println(wujiangArray[3][0]);
                break;
            case 5:
                System.out.println(wujiangArray[4][0]);
                break;
            case 6:
                System.out.println(wujiangArray[5][0]);
                break;
            default:
                System.out.println("你的输入有误！");
        }
    }
}
