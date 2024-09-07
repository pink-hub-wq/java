import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * 方法的递归调用
 */
public class SL11 {
	//fact()方法，使用方法的递归调用来计算阶乘
	int fact (int n){
		//定义返回值
		int result;
		if(n == 1){
			return 1;
		}
		//递归调用本方法
		result = fact(n - 1) * n;
		return result;
		
	}
}
