
public class LX2 {
	public static void main(String[] args) {
		int a = 100;//甲乙两地距离（米）
		double b = 0.82;//小明每秒的速度（米）
		double c = 0.63;//小刚每秒的速度（米）
		double d = b + c;//两人每秒走的距离（米）
		double e = a / d;//两人相遇用了多少秒
		double f = e / 60;//两人相遇用了多少分钟
		int g = (int)f;
		System.out.println("两人相遇用了"+g+"分钟");
		}
}
