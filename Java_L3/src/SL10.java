/**
 *if�ڲ�Ƕ��
 *switch-case
 */
import java.util.Scanner;
public class SL10 {
	public static void main(String[] args) {
		System.out.println("������������ܼ�");
		Scanner sc = new Scanner (System.in);//�����û�����
		int a = sc.nextInt();	//��ȡ�����ֵ��������
		switch (a) {
			case 1:
			case 2:
			case 3:
			case 4:
			//���case1~4��ƥ�䣬�򶼽�ִ��case5�Ĵ��룬Ȼ������
			case 5:System.out.println("������");break;
			case 6:
			//���case6��ƥ�䣬���ִ��case7�Ĵ��룬Ȼ������
			case 7:System.out.println("��Ϣ��");break;
			//ȱʡ������
			default:System.out.println("�������");
		}
		
	}
}