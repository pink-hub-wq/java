
/**
 * 冒泡排序
 */
public class SL9 {
	public static void main(String[] args) {
		//定义序列
		int [] a = new int [] {3,0,1,18,5,0,-5,-6,3};
		int b = a.length;
		for(;--b > 0;){
			for(int i = 0;i < b;++i ){
				//如果相邻的左边元素小于右边的元素，则互换
				if(a[i] < a[i + 1]){
					int c = a [i];
					a[i] = a[i + 1];
					a[i + 1] = c;
				}
			}
		}
		//输出已经完成排序的数组
		for(int i = 0;i < a.length;++i){
			System.out.print(a[i] + " ");
		}
	}
}
