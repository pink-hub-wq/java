/**
 *break����ѭ�����
 */
public class SL17{
	public static void main(String[] args) {
		int i = 0;
		for(i = 1000; i < 2001; i++) {
			if(i % 123 == 0){//�ж��Ƿ��ܱ�123����
				break;
				}
			}
		System.out.println("��һ���ܱ�123����������" + i);
	}
}
