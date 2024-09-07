
public class SL11 {
	public static void main(String[] args) {
		String [] [] x = new String [2] [3];//声明定义数组
		//"x.length"表示二维数组的行数
		for(int i = 0;i < x.length;i++){
			//遍历每个一维数组
			for (int j = 0;j < x [i].length;j++){
				x [i] [j] = "第" + i + "行，第" + j + "列";
			}
		}
		//遍历输出二维数组的值
		for (int i = 0;i < x.length;i++) {
			//遍历每个一维数组
			for (int j = 0;j < x [i].length;j++){
			System.out.print(x [i] [j] + " ");
			}
			System.out.println();
		}
	}
}
