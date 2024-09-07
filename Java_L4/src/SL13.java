/**
 * 矩形转换
 */
public class SL13 {
	public static void main(String[] args) {
		int [] [] a = new int [] []{{1,2,3},{4,5,6}};//定义并初始化原矩阵
		int [] [] b = new int [3] [2];//定义目标矩阵
		System.out.println("source matrix");
		for(int rowindex = 0;rowindex < a.length;++rowindex){
			for(int columnindex = 0;columnindex <a[rowindex].length;++columnindex){
				System.out.print(a[rowindex][columnindex] + "");
				b[columnindex] [rowindex] = a[rowindex] [columnindex];//元素互换
			}
			System.out.println("");
		}
		System.out.println("target matrix:");
		//输出已完成转换的目标矩阵
		for(int rowindex = 0;rowindex < b.length;++rowindex){
			for(int columnindex = 0;columnindex <b[rowindex].length;++columnindex){
				System.out.print(b[rowindex][columnindex] + "");
			}
			System.out.println(" ");
		}
	}
}
