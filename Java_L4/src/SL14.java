//��ӡ�����������
public class SL14 {
	public static void main (String[] args) {
		int [] [] a=new int [10] [10];
		//����ֵ1�洢��������Ӧ��λ��
		for (int index = 0; index < a. length; ++index) {
		a [index] [0] =1;
		a [index] [index] =1;
		}
		//����ֵ����������ε��߼��洢����������Ӧ��λ��
		for (int rlndex = 2; rlndex < a.length; ++rlndex) {
			for (int clndex = 1; clndex < rlndex; ++clndex) {
				a [rlndex] [clndex] = a [rlndex - 1] [clndex - 1] + a[rlndex - 1][clndex];
			}
		}
		for (int rlndex = 0; rlndex < a. length; ++rlndex)  {
				for (int clndex = 0; clndex <= rlndex; ++clndex){
					System. out. print(a[rlndex][clndex] + " ") ;
				}
		System. out. println();
		}
	}
}
