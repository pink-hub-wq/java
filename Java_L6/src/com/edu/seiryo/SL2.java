package com.edu.seiryo;

public class SL2 {
	public static void main(String[] args) {
		//ʵ����ʮ������
		for(int i = 1;i <= 10;i++){
			SL1 houge = new SL1();
			/*ÿ�����ӳ�һ����
			 * ������ʾ�̬����
			 */
			SL1.peach = SL1.peach - 1;
			System.out.println("����" + SL1.peach + "����");
		}
	}
}
