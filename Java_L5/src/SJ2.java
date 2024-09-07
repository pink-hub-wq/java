
public class SJ2{
	public static void main(String[] args) {
		SJ1 monkey1 = new SJ1("棕色");
		SJ1 monkey2 = new SJ1("黑色","母");
		int a = monkey1.addTwo(2, 3);
		int b = monkey2.addThree(3, 4, 5);
		System.out.println("monkey1的颜色是" + monkey1.color);
		System.out.println("monkey1的性别是" + monkey1.gender);
		System.out.println("monkey1整数相加是" + a);
		System.out.println("monkey2的颜色是" + monkey2.color);
		System.out.println("monkey2的性别是" + monkey2.gender);
		System.out.println("monkey2整数相加是" + b);
	}
}