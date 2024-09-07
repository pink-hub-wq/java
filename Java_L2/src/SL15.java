/**
*强制类型转换
*/
public class SL15 {
	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("将整型转换为字节型：");
		b=(byte)i;
		System.out.println("i→b:" + i + "→" + b);
		System.out.println("将双精度型转换为整型：");
		i=(int)d;
		System.out.println("d→i:" + d + "→" + i);
		System.out.println("将双精度型转换为字节型：");
		b=(byte)d;
		System.out.println("d→b:" + d + "→" + b);		
	}
}
