/**
 * while
 */
public class SL11 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;//求和变量
		while(i <= 10){//执行条件
			sum += i;//累加并存储
			++i;//加数递增
		}
		System.out.println("1+2+...10=" + sum);
	}
}
