/**
 * Ѱ�Ҷ�ά����İ���
 */
public class ZD2 {
	public static void main(String[] args) {
		//��ʼ����ά����
			int [] [] pointMatrix = new int [] [] {
			{-9,97,5,970},
			{2,99,33,99},
			{51,97,-45,97},
			{85,97,122,100}};
		//��¼�Ƿ���ڰ���
		boolean hasPoint = false;
		//ѭ�������������
		for (int index = 0; index < pointMatrix.length; ++index) {
		//�ֱ��¼�е����ֵ���е���Сֵ
		int rowMax=-1,columnMix=-1;
		//�ҳ��е����ֵ
		for (int n = 0; n < pointMatrix[index].length; ++n) {
		if (n == 0) {
			rowMax = pointMatrix [index] [n];
		} else if (rowMax < pointMatrix [index] [n]) {
		    rowMax = pointMatrix [index] [n];
		}
}
		//һ���п��ܳ��ֶ����ȵ����ֵ��������Ҫʹ��ѭ������λ
		for (int n = 0; n < pointMatrix [index].length; ++n) {
		if (rowMax == pointMatrix [index][ n]) {
			for (int suf = 0; suf < pointMatrix.length; ++suf) {
				if (suf == 0) {
					columnMix = pointMatrix [suf] [n];
				}
				else if (columnMix > pointMatrix [suf] [n]) {
					columnMix = pointMatrix [suf] [n];
				}
			}
		//������ʾ�����ǰ���
		if (rowMax == columnMix) {
			hasPoint = true;
			System.out.println(pointMatrix [index] [n] + "Ϊ���㣬λ�ã�["+index+"] ["+n+"]");
		   }
		}
	}
}
		if (!hasPoint) {
		System.out.println("������û�а���");
		}
	}
}
