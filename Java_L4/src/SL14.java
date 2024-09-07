//打印杨辉三角形类
public class SL14 {
	public static void main (String[] args) {
		int [] [] a=new int [10] [10];
		//将数值1存储到数组相应的位置
		for (int index = 0; index < a. length; ++index) {
		a [index] [0] =1;
		a [index] [index] =1;
		}
		//其他值则按杨辉三角形的逻辑存储到数组中相应的位置
		for (int rlndex = 2; rlndex < a.length; ++rlndex) {
			for (int clndex = 1; clndex < rlndex; ++clndex) {
				a [rlndex] [clndex] = a [rlndex - 1] [clndex - 1] + a[rlndex - 1][clndex];
			}
		}
		for (int rlndex = 0; rlndex < a. length; ++rlndex)  {
				for (int clndex = 0; clndex <= rlndex; ++clndex){
					System. out. print(a[rlndex][clndex] + " ") ;
				}
		System. out. println();
		}
	}
}
