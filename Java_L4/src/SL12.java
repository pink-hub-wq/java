/**
 * ʹ�ò������ά����
 */
public class SL12 {
	public static void main(String[] args) {
		int [] [] x = new int [5] [];
		//��ֵ�����δ��Ԫ��x[4]��ֵ
		//��x[4]����һ��������������
		//����x[4]��ֵΪĬ��ֵnull
		x [0] = new int [4]; //��0����4��Ԫ�� 
		x [1] = new int [3]; //��1����3��Ԫ��
		x [2] = new int [1]; //��2����1��Ԫ��
		x [3] = new int [2]; //��3����2��Ԫ��
		//�����������ά���飬�����ÿһ��Ԫ�ص�ֵ
		for(int rowindex = 0;rowindex < x.length;++rowindex){
			System.out.print("��" + (rowindex + 1) + "�У�");
			if(x [rowindex] == null){
				System.out.print(x[rowindex]);
				continue;
			}
		for (int columnindex = 0;columnindex < x [rowindex].length;++columnindex) {
			System.out.print(x [rowindex] [columnindex] + " ");
		}
		System.out.println();
		}
	}
}
