package java_L13;

public class SL1_Test {
	public static void main(String[] args) {
		String str = "   �׾�    ";
        System.out.println("ȥ�ո�ǰ���ַ���Ϊ��");
        System.out.println(str);
        System.out.println("ȥ�ո����ַ���Ϊ��");
        System.out.println(new SL1_TrimDemo().getTrim(str));
	}
}
