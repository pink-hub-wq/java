/**
 *ifǶ��ʹ��
 */
import
java.util.Scanner;
public class SL6 {
	public static void main(String[] args) {
		System.out.println("�������������");
		Scanner sc = new Scanner (System.in);//�����û���������
		int age = sc.nextInt();				//�����������age
		if(age < 18){						//��������18������ʱִ��					
			System.out.println("δ����");	
		} else if(age >= 18 && age < 35){	//��������18~35��֮��ʱִ��
			System.out.println("����");		
		} else if(age >= 35 && age < 55){	//��������35~55��֮��ʱִ��
			System.out.println("������");
		} else{								//��������ڵ���55��ʱִ��
			System.out.println("����");
		}
		
	}
}

