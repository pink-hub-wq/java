/*
 * 显示地声明构造方法
 */
public class JD2 {
	//描述学生年龄
	int age;
	//学生的单科考试分数
	int score;
	//平均分
	int avgscore;
	/*
	 无参数的构造方法
	 方法名与类名完全相同
	 不需要返回值类型
	 */
	JD2(){
		System.out.println("我被初始化了！");
	}
	//学生有参加考试的行为，返回值为学生的成绩
	int Examination(int score1){
		score = score1;//将score1的分数值赋给类变量的score
		return score;//返回分数
	}
	//多个参数返回int值
	int Avg(int score1,int score2,int score3){
		int s = 0;
		s =(score1 + score2 + score3)/ 3;
		return s;
	}
	//方法参数，根据实际情况可以没有参数
	void studywhere(){
		System.out.println("就读青凌未来");
	}
	//为每位同学的平均分增加5
	int Addscore(int score4,int score5,int score6){
		int a = Avg(score4,score5,score6) + 5;
		return a;
	}
}

