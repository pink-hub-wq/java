
public class SL14 {
	public static void main(String[] args) {
		int a;
		double b;
		char c;
		boolean d;
		byte f = 1;
		a = f;//可以自动转换
		b = a;
		/*
		a = d;//数值型与布尔型不兼容，不能自动转换
		c = d;//布尔型与字符型不兼容，不能自动转换
		*/
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
