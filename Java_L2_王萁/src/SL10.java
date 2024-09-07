/**
*递增运算符
*区别b=++a与b=a++
*/
public class SL10 {
	public static void main(String[] args) {
		int a = 3;
		int b= a++;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		a = 3;
		b = ++a;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
