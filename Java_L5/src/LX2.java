
public class LX2 {
	int age;
	int score;
	int avgscore;
	void studywhere(){
		System.out.println("�Ͷ�������δ���Ƽ�");
	}
	int Examination(int score1){
		score = score1;
		return score;
	}
	int Avg(int score1,int score2,int score3){
		int s = 0;
		s =(score1 + score2 + score3)/ 3;
		return s;
	}
	int Addscore(int score4,int score5,int score6){
		int a = Avg(score4,score5,score6) + 5;
		return a;
	}
}