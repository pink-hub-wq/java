
import java.util.Scanner;
public class SJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//接收用户输入的数字
        System.out.println("请输入一个三位数：");
        int number = scanner.nextInt();//定义数字变量      
        if (number < 100 || number > 999) {
        System.out.println("输入的不是一个三位数！");
        } else {
        int a = number / 100;//获取百位上的数
        int b = number / 10 % 10;//获取十位上的数
        int c = number % 10;//获取个位上的数
        int sum = a + b +c;//各位数字之和
        System.out.println("百位上的数为：" + a);
        System.out.println("十位上的数为：" + b);
        System.out.println("个位上的数为：" + c);
        System.out.println("各位数字之和为：" + sum);
        }
    }
}
