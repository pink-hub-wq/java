import
java.util.Scanner;
public class ZD1 {
	public static void main(String[] args) {
		System.out.println("��������ķ���");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//С��60ʱִ��
		if(x < 60){
			System.out.println("�ɼ��ǲ");
			//��60~75֮��ʱִ��
		} else if (x >= 60 && x < 75){
			System.out.println("�ɼ����У�");
			//��75~95֮��ʱִ��
		} else if (x >= 75 && x < 95){
			System.out.println("�ɼ�������");
			//����95ʱִ��
		} else {
			System.out.println("�ɼ����ţ�");
		}
			
	}
}
