/**
 *while�����do-while��������
 */
public class SL13{
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		while(a > 20){//���ж���ִ��
			b = a;
		}
		System.out.println("while����е�b=" + b);
		do{	//��ִ�к��ж�
			b = a;
		} while(a > 20);
		System.out.println("do_while����е�b=" + b);
	}
}
