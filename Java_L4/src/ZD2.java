/**
 * 寻找二维数组的鞍点
 */
public class ZD2 {
	public static void main(String[] args) {
		//初始化二维数组
			int [] [] pointMatrix = new int [] [] {
			{-9,97,5,970},
			{2,99,33,99},
			{51,97,-45,97},
			{85,97,122,100}};
		//记录是否存在鞍点
		boolean hasPoint = false;
		//循环数组的行索引
		for (int index = 0; index < pointMatrix.length; ++index) {
		//分别记录行的最大值、列的最小值
		int rowMax=-1,columnMix=-1;
		//找出行的最大值
		for (int n = 0; n < pointMatrix[index].length; ++n) {
		if (n == 0) {
			rowMax = pointMatrix [index] [n];
		} else if (rowMax < pointMatrix [index] [n]) {
		    rowMax = pointMatrix [index] [n];
		}
}
		//一行中可能出现多个相等的最大值，所以需要使用循环来定位
		for (int n = 0; n < pointMatrix [index].length; ++n) {
		if (rowMax == pointMatrix [index][ n]) {
			for (int suf = 0; suf < pointMatrix.length; ++suf) {
				if (suf == 0) {
					columnMix = pointMatrix [suf] [n];
				}
				else if (columnMix > pointMatrix [suf] [n]) {
					columnMix = pointMatrix [suf] [n];
				}
			}
		//相等则表示该数是鞍点
		if (rowMax == columnMix) {
			hasPoint = true;
			System.out.println(pointMatrix [index] [n] + "为鞍点，位置：["+index+"] ["+n+"]");
		   }
		}
	}
}
		if (!hasPoint) {
		System.out.println("该序列没有鞍点");
		}
	}
}
