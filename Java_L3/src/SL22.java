
public class SL22 {
	public static void main(String[] args) {
		int numeric = 3;
		while(numeric <= 50){//���Ʊ�����
			int tempNum = 2;
			while(tempNum < numeric){//����������2������������֮��ʱ��ѭ������
				if(numeric % tempNum == 0) { //����ܱ���������������ѭ��		
					break;
				}
				++tempNum;//ʹ������1
			}
			if (tempNum == numeric) {//���ֻ�ܱ�������������Ϊ����
			System.out.println(numeric);
			}
			++numeric;
		}
	}
}
