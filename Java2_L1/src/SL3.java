import java.util.Scanner;

public class SL3 {
	public static void main(String[] args) {
        System.out.println("实现控制台输入");
        System.out.println("-------------");
        System.out.print("请输入文字：");
        Scanner sc = new Scanner(System.in);
        String strTxt = sc.next();
        System.out.println("你输入的文字为：" + strTxt);
    }
}
