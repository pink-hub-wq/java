
public class SL11 {
	public static void main(String[] args) {
		String [] [] x = new String [2] [3];//������������
		//"x.length"��ʾ��ά���������
		for(int i = 0;i < x.length;i++){
			//����ÿ��һά����
			for (int j = 0;j < x [i].length;j++){
				x [i] [j] = "��" + i + "�У���" + j + "��";
			}
		}
		//���������ά�����ֵ
		for (int i = 0;i < x.length;i++) {
			//����ÿ��һά����
			for (int j = 0;j < x [i].length;j++){
			System.out.print(x [i] [j] + " ");
			}
			System.out.println();
		}
	}
}
