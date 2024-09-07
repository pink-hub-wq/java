/**
 * 对象访问属性
 */
public class SL4 {
	public static void main(String[] args) {
		SL2 houge = new SL2();//实例化一个具体的猴子对象
		houge.age = 3;//对象访问变量
		System.out.println("猴哥的年龄是：" + houge.age + "岁");
	}
}


