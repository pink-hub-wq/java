/**
 * ѡ������
 */
public class SL10 {
	public static void main(String[] args) {
		//��������
		int [] a = new int [] {3,0,1,18,5,0,-5,-6,3};
		//������ʱ�洢Ԫ�ص�ֵ���±�
		int [] b = new int [2];
		int temp;
		//��ѭ��������Ҫ�Ƚϵ�����
		for(int i = 0;i < a.length-1;++i){
			//��¼Ŀ��Ԫ�ص�ֵ
			b [0] = a [i];
			//��¼Ŀ��Ԫ�ص��±�
			b [1] = i;
			//��ѭ��������Ҫ�ȽϵĴ���
			for(int n = i + 1;n < a.length;++n){
				//���������д���С��Ŀ��Ԫ�ص�Ԫ�أ����¼��Ԫ�ص�ֵ���±�
				if(b [0] > a[n]){
					b [0] = a[n];
					b [1] = n;
				}
			}
			//���������д���С��Ŀ��Ԫ�ص�Ԫ�أ��򽫸�Ԫ�غ�Ŀ��Ԫ�ص�λ�ý��н���
				if(b [1] != i){
					temp = a [i];
					a [i] =b [0];
					a[b[1]] = temp;
				}
			}
			//����Ѿ��ź��������
			for(int i = 0;i < a.length;++i) {
			System.out.print(a[i] + " ");
		}
	}
}
