import java.util.Scanner;

public class SJ3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("请输入合计金额：");
        double heji = scanner.nextDouble();
        System.out.print("请输入收款金额：");
        double shoukuan = scanner.nextDouble();       
        double zhaoling = shoukuan - heji;
        if (zhaoling < 0) {
            System.out.println("收款金额不足！");
        } else if (zhaoling == 0) {
            System.out.println("不需要找零！");
        } else {
            int yuan = (int)zhaoling;//找几元
            int jiao = (int)((zhaoling - yuan) * 10); //找几角
            int fen = (int)(zhaoling * 100 % 10);//找几分
            System.out.println("找零金额为：" + yuan + "元" + jiao + "角" + fen + "分");
        }
    }
}