
public class SJ1 {
	public static void main(String[] args) {
		 int [] a = new int [] {67, 89, 87, 69, 90, 100, 75, 90};
	        int max = a [0];
	        int min = a [0];
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] > max) {
	                max = a[i];
	            } else if (a[i] < min) {
	                min = a[i];	         
	            } else {
	            }
	        }
	        System.out.println("最大值：" + max);
	        System.out.println("最小值：" + min);
	}
}
