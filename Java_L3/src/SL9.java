import
java.util.Scanner;
public class SL9 {
	public static void main(String[] args) {
		System.out.println("�������·�");
		Scanner sc = new Scanner (System.in);//�����û������·�
		int month = sc.nextInt();		//�����·ݱ���month		
		if(month == 12 || month == 1 || month == 2){//��month == 1��2��12ʱִ��				
			System.out.println("��Լ�Ƕ���");
		} else {
			if(month == 3 || month == 4 || month == 5){	//��month == 3��4��5ʱִ��
				System.out.println("��Լ�Ǵ���");
			} else {
				if(month == 6 || month == 7 || month == 8){	//��month == 6��7��8ʱִ��
					System.out.println("��Լ���ļ�");
				} else {
					if(month == 9 || month == 10 || month == 11){//��month == 9��10��11ʱִ��
						System.out.println("��Լ���＾");
					} else{//��month����1~12֮��ʱִ��
						System.out.println("�·ݲ��Ϸ�");
					}
				}
			}
		}
	}
}