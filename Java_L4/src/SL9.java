
/**
 * ð������
 */
public class SL9 {
	public static void main(String[] args) {
		//��������
		int [] a = new int [] {3,0,1,18,5,0,-5,-6,3};
		int b = a.length;
		for(;--b > 0;){
			for(int i = 0;i < b;++i ){
				//������ڵ����Ԫ��С���ұߵ�Ԫ�أ��򻥻�
				if(a[i] < a[i + 1]){
					int c = a [i];
					a[i] = a[i + 1];
					a[i + 1] = c;
				}
			}
		}
		//����Ѿ�������������
		for(int i = 0;i < a.length;++i){
			System.out.print(a[i] + " ");
		}
	}
}
