/**
 * ��дһ��Monkey��
 */
public class SL17{
		//���ӵ�����
		int age;
		//��������
		int ability;
		//���췽��
		SL17(int a){
			age = a;
			System.out.println("�����ǣ�" + age);
		}
		//������һ�����췽��������Ҫ�����յĹ��췽�������������ʽ������
		SL17(){
			
		}
		//�޲����޷���ֵ�ķ���
		void killNiu() {
			System.out.println("��ɱţħ����");	
		}
		//�в����޷���ֵ�ķ���
		void repay(int money){
			System.out.println("��ʦ����" + money +"Ԫ��������");		
		}
		//�в����з���ֵ�ķ���
		int buyCigarettes(int money,int price) {
			//����repay()����
			repay(money / 2);
			//��Ҫ���ص�ֵ
			int count = 0;
			//�������̵İ���
			return money/2/price;
		}
}