/**
 * ��дһ��Monkey��
 */
public class SL14{
		//���ӵ�����
		int age;
		//��������
		int ability;
		//���췽��
		SL14(int a){
			age = a;
			System.out.println("�����ǣ�" + age);
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