
//����forѭ���ж�������������׳�

import
java.util.Scanner;
public class ZD2_1{
	public static void main(String[] args){
		System.out.println("������һ��������:");
		//�����û�����
		Scanner sc = new Scanner(System.in);
		//���������ݸ�������a
		int a = sc.nextInt();
		//�洢�׳˵Ļ�
		long j = 1;
		//����0���������ܽ��н׳�����
		if (a >= 0){
			//ѭ������
			for (; a>=1; a--){
				j = j * a;
			}
			System.out.println("�Ľ׳�Ϊ" + j);
		}else{
			System.out.println(a + "���ܽ��н׳˼��㡣");
		}
	}
}