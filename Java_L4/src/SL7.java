
public class SL7 {
	public static void main(String[] args) {
		int [] item = new int [10];//声明数组
		int total = 0;//求和变量
		for(int index = 0;index < 10;index++){//循环给数组赋值
			item [index] = index * 3;
		}	
		for(int index = 0;index < 10;index++){//循环访问数组每个元素
			total= total+ item[index];
		}
		System.out.println("total=" + total);
	}
}
