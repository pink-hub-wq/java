package java_L13;

public class SL1_Test {
	public static void main(String[] args) {
		String str = "   雷军    ";
        System.out.println("去空格前的字符串为：");
        System.out.println(str);
        System.out.println("去空格后的字符串为：");
        System.out.println(new SL1_TrimDemo().getTrim(str));
	}
}
