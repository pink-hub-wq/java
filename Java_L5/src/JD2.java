/*
 * ��ʾ���������췽��
 */
public class JD2 {
	//����ѧ������
	int age;
	//ѧ���ĵ��ƿ��Է���
	int score;
	//ƽ����
	int avgscore;
	/*
	 �޲����Ĺ��췽��
	 ��������������ȫ��ͬ
	 ����Ҫ����ֵ����
	 */
	JD2(){
		System.out.println("�ұ���ʼ���ˣ�");
	}
	//ѧ���вμӿ��Ե���Ϊ������ֵΪѧ���ĳɼ�
	int Examination(int score1){
		score = score1;//��score1�ķ���ֵ�����������score
		return score;//���ط���
	}
	//�����������intֵ
	int Avg(int score1,int score2,int score3){
		int s = 0;
		s =(score1 + score2 + score3)/ 3;
		return s;
	}
	//��������������ʵ���������û�в���
	void studywhere(){
		System.out.println("�Ͷ�����δ��");
	}
	//Ϊÿλͬѧ��ƽ��������5
	int Addscore(int score4,int score5,int score6){
		int a = Avg(score4,score5,score6) + 5;
		return a;
	}
}

