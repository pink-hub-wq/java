
public class SJ2{
	public static void main(String[] args) {
		SJ1 monkey1 = new SJ1("��ɫ");
		SJ1 monkey2 = new SJ1("��ɫ","ĸ");
		int a = monkey1.addTwo(2, 3);
		int b = monkey2.addThree(3, 4, 5);
		System.out.println("monkey1����ɫ��" + monkey1.color);
		System.out.println("monkey1���Ա���" + monkey1.gender);
		System.out.println("monkey1���������" + a);
		System.out.println("monkey2����ɫ��" + monkey2.color);
		System.out.println("monkey2���Ա���" + monkey2.gender);
		System.out.println("monkey2���������" + b);
	}
}