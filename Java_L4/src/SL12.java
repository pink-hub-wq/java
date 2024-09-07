/**
 * 使用不规则二维数组
 */
public class SL12 {
	public static void main(String[] args) {
		int [] [] x = new int [5] [];
		//赋值语句中未给元素x[4]赋值
		//而x[4]又是一个数组对象的引用
		//所以x[4]的值为默认值null
		x [0] = new int [4]; //第0行有4列元素 
		x [1] = new int [3]; //第1行有3列元素
		x [2] = new int [1]; //第2行有1列元素
		x [3] = new int [2]; //第3行有2列元素
		//遍历不规则二维数组，并输出每一个元素的值
		for(int rowindex = 0;rowindex < x.length;++rowindex){
			System.out.print("第" + (rowindex + 1) + "行：");
			if(x [rowindex] == null){
				System.out.print(x[rowindex]);
				continue;
			}
		for (int columnindex = 0;columnindex < x [rowindex].length;++columnindex) {
			System.out.print(x [rowindex] [columnindex] + " ");
		}
		System.out.println();
		}
	}
}
