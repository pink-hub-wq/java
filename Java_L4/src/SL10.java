/**
 * 选择排序
 */
public class SL10 {
	public static void main(String[] args) {
		//定义序列
		int [] a = new int [] {3,0,1,18,5,0,-5,-6,3};
		//用于临时存储元素的值和下标
		int [] b = new int [2];
		int temp;
		//外循环控制需要比较的轮数
		for(int i = 0;i < a.length-1;++i){
			//记录目标元素的值
			b [0] = a [i];
			//记录目标元素的下标
			b [1] = i;
			//内循环控制需要比较的次数
			for(int n = i + 1;n < a.length;++n){
				//若序列中有存在小于目标元素的元素，则记录该元素的值和下标
				if(b [0] > a[n]){
					b [0] = a[n];
					b [1] = n;
				}
			}
			//若序列中有存在小于目标元素的元素，则将该元素和目标元素的位置进行交换
				if(b [1] != i){
					temp = a [i];
					a [i] =b [0];
					a[b[1]] = temp;
				}
			}
			//输出已经排好序的数组
			for(int i = 0;i < a.length;++i) {
			System.out.print(a[i] + " ");
		}
	}
}
