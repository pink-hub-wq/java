/**
 * ����ת��
 */
public class SL13 {
	public static void main(String[] args) {
		int [] [] a = new int [] []{{1,2,3},{4,5,6}};//���岢��ʼ��ԭ����
		int [] [] b = new int [3] [2];//����Ŀ�����
		System.out.println("source matrix");
		for(int rowindex = 0;rowindex < a.length;++rowindex){
			for(int columnindex = 0;columnindex <a[rowindex].length;++columnindex){
				System.out.print(a[rowindex][columnindex] + "");
				b[columnindex] [rowindex] = a[rowindex] [columnindex];//Ԫ�ػ���
			}
			System.out.println("");
		}
		System.out.println("target matrix:");
		//��������ת����Ŀ�����
		for(int rowindex = 0;rowindex < b.length;++rowindex){
			for(int columnindex = 0;columnindex <b[rowindex].length;++columnindex){
				System.out.print(b[rowindex][columnindex] + "");
			}
			System.out.println(" ");
		}
	}
}
