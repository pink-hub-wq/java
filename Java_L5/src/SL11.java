import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * �����ĵݹ����
 */
public class SL11 {
	//fact()������ʹ�÷����ĵݹ����������׳�
	int fact (int n){
		//���巵��ֵ
		int result;
		if(n == 1){
			return 1;
		}
		//�ݹ���ñ�����
		result = fact(n - 1) * n;
		return result;
		
	}
}
