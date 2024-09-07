/**
 *for语句中的省略表达式 2与表达式 1
 */
public class SL16{
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for(; i < 11;){
			sum += i++;
		}
		System.out.println("1+2+...10=" + sum);
	}
}
