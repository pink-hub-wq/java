import java.util.Scanner;

public class LX2 {
	public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("-----武将列表-----");
        System.out.print("刘备 \t 赵云 \n");
        System.out.print("曹操 \t 夏侯惇 \n");
        System.out.print("孙权 \t 周瑜 \n");
        System.out.println("请输入要选择的武将名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("你选择" + "'" + name + "'进行游戏");
    }
}
