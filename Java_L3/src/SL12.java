/**
 * do-while语句
 */
public class SL12{
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;//求和变量
		do{
			sum +=i;//累加并存储
			i++;//加数递增
		} while(i <=10);//执行条件		
		System.out.println("1+2+...10=" + sum);
	}
}
