
//ʹ��do-whileѭ��ʵ�ֲ�����Ϸ
import
java.util.Scanner;
public class ZD2_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = 39;
		int i = 0;
		System.out.println("�������֣�");
		do{
			//����������ָ�������b
			int b = sc.nextInt();
			//�ж��Ƿ������ȷ
			if(b > a) {
				System.out.println("����");
				System.out.println("�ٴ��������֣�");
			}else{
				if(b < a){
				System.out.println("С��");
				System.out.println("�ٴ��������֣�");
			}else{
				System.out.println("������ȷ�� ");
				//�����ȷ���������
				System.exit(0);
			}
		}
		//�ı�ѭ������
		i++;
		}while(i<5);
	}
}