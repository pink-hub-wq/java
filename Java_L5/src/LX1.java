
public class LX1 {
	int age;
	int score; 
	int avgscore;
	void studywhere(){
		System.out.println("就读于青凌未来科技");
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
}