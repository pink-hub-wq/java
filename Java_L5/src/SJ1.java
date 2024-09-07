
public class SJ1 {
	String color;
	String gender;
	SJ1(String newcolor,String newgender){
		color = newcolor;
		gender = newgender;
	}
	SJ1(String newcolor){
		color = newcolor;
		gender ="¹«";
	}
	int addTwo(int a,int b){
		int sum = a + b;
		return sum;
	}
	int addThree(int a,int b,int c){
		return addTwo(a,b) + c;
	}
}
