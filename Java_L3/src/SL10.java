/**
 *if内部嵌套
 *switch-case
 */
import java.util.Scanner;
public class SL10 {
	public static void main(String[] args) {
		System.out.println("请输入今天是周几");
		Scanner sc = new Scanner (System.in);//接收用户输入
		int a = sc.nextInt();	//读取输入的值赋给变量
		switch (a) {
			case 1:
			case 2:
			case 3:
			case 4:
			//如果case1~4被匹配，则都将执行case5的代码，然后跳出
			case 5:System.out.println("工作日");break;
			case 6:
			//如果case6被匹配，则会执行case7的代码，然后跳出
			case 7:System.out.println("休息日");break;
			//缺省处理器
			default:System.out.println("输入错误");
		}
		
	}
}