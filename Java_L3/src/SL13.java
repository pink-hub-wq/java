/**
 *while语句与do-while语句的区别
 */
public class SL13{
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		while(a > 20){//先判断再执行
			b = a;
		}
		System.out.println("while语句中的b=" + b);
		do{	//先执行后判断
			b = a;
		} while(a > 20);
		System.out.println("do_while语句中的b=" + b);
	}
}
