package java2_L2;

public class SL2 {
	public static void main(String[] args) {
        byte a = 10;
        int i = a;
        System.out.println("byte类型自动转换为int类型：" + i);
        char c = 'A';
        i = c;
        System.out.println("char类型自动转换为int类型：" + i);
        float f = i;
        System.out.println("int类型自动转换为float类型：" + f);
    }
}
