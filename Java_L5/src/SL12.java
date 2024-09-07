/**
 * 定义Monkey类
 */
public class SL12{
		//猴子的年龄
		int age;
		//技能种类
		int ability;
		//无参数无返回值的方法
		void killNiu() {
			System.out.println("刺杀牛魔王！");	
		}
		//有参数无返回值的方法
		void repay(int money){
			System.out.println("代师傅把" + money +"元还给观音");		
		}
		//有参数有返回值的方法
		int buyCigarettes(int money,int price) {
			//调用repay()方法
			repay(money / 2);
			//需要返回的值
			int count = 0;
			//返回香烟的包数
			return money/2/price;
			}
}