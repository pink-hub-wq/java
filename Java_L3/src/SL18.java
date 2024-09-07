
public class SL18{
	public static void main (String[] args) {
		int i=0;//定义计数变量
		System.out.println("统计开始：");
		for(int number = 1;number < 21; ++number) {
		if (number % 4 != 0) {	//若不能被4整除，立即结束本次循环
				continue;
		}		
		++i;					//将计数变量加1，并输出当前能被4整除的数字
		System.out. println("能被4整除的数有："+number);
		}		
		System.out.println ("一共有"+i+"个数字");
	}
}
