/**
 *for语句中的省略表达式 1
 */
public class SL15{
	public static void main(String[] args) {
		int i = 10;
		int sum = 0;
		for(; i > 0;i--){
			sum += i;
		}
		System.out.println("10+9+...+1=" + sum);
	}
}
