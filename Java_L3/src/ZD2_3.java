
//ʹ��whileѭ��ͳ������9���ֵĴ��� 

public class ZD2_3{
	public static void main(String[] args){
		System.out.println("100��������9���ֵĴ���");
		//ѭ������
		int i = 1;
		//��¼����
		int count = 0;
		while(i <= 100){
			//�ж�i���Ƿ��������9
			//��λ����9���ж�
			if ((i + 1) % 10 == 0) {
				count++;
			}else{
				//ʮλ����9���ж�
				if(i >= 90 && i < 99){
					count++;
				}
			}
				//�ı�ѭ������
				i++;
		}
		System.out.println(count);
	}
}