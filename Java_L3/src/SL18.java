
public class SL18{
	public static void main (String[] args) {
		int i=0;//�����������
		System.out.println("ͳ�ƿ�ʼ��");
		for(int number = 1;number < 21; ++number) {
		if (number % 4 != 0) {	//�����ܱ�4������������������ѭ��
				continue;
		}		
		++i;					//������������1���������ǰ�ܱ�4����������
		System.out. println("�ܱ�4���������У�"+number);
		}		
		System.out.println ("һ����"+i+"������");
	}
}
