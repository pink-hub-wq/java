
public class SL7 {
	public static void main(String[] args) {
		int [] item = new int [10];//��������
		int total = 0;//��ͱ���
		for(int index = 0;index < 10;index++){//ѭ�������鸳ֵ
			item [index] = index * 3;
		}	
		for(int index = 0;index < 10;index++){//ѭ����������ÿ��Ԫ��
			total= total+ item[index];
		}
		System.out.println("total=" + total);
	}
}
