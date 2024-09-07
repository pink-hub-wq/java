/**
 * 方法的相互调用
 */
public class SL10 {
	public static void main(String[] args) {
		//示例对象houge
		SL9 houge = new SL9();
		int a = houge.buyCigarettes(100, 5);
		System.out.println("悟空帮师傅买了" + a + "包烟");		
	}
}
