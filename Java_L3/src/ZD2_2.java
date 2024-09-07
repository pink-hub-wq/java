
//使用do-while循环实现猜数游戏
import
java.util.Scanner;
public class ZD2_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = 39;
		int i = 0;
		System.out.println("输入数字：");
		do{
			//将输入的数字赋给变量b
			int b = sc.nextInt();
			//判断是否猜数正确
			if(b > a) {
				System.out.println("大了");
				System.out.println("再次输入数字：");
			}else{
				if(b < a){
				System.out.println("小了");
				System.out.println("再次输入数字：");
			}else{
				System.out.println("猜数正确！ ");
				//如果正确则结束程序
				System.exit(0);
			}
		}
		//改变循环变量
		i++;
		}while(i<5);
	}
}