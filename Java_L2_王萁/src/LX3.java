
public class LX3 {
	public static void main(String[] args) {
		int a = 12;//圆的半径
		double b = 3.1415926;//圆周率
		double c = b * a * a;//圆的面积
		int d = (int)c;
		double e = 2 * b * a;//圆的周长
		int f = (int)e;
		System.out.println("圆的面积为"+d+"平方厘米");
		System.out.println("圆的周长为"+f+"厘米");
		}
}
