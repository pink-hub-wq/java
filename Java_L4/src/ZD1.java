/**
 * ��������
 */
public class ZD1 {
	public static void main(String[] args) {
		//��������a�����ڴ��ż��
		int [] a = new int[30];
		//��������b�����ڴ��ƽ��ֵ
		int [] b = new int[6];
		//��������a
		for (int i = 0; i < a.length; i++) {
			//��ֵż��
			a [i] = 2 * (i + 1);
			//����ǵ�����������ƽ����
			if ((i + 1) %5 == 0) {
				int avg = 0;
				//��������a��5��������Ԫ��
				for (int j = i - 4; j <= i; j++){
				avg = avg + a [j];
				}
				//��ƽ��ֵ����b
				b[(i + 1) / 5-1] = avg / 5;
				System.out.println(b[(i + 1) / 5 - 1] + "");
			}
		}
	}
}
