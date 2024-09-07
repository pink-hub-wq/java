/**
 * 数组的长度
 */
public class SL8 {
	public static void main(String[] args) {
		//定义字符数组
		char [] chars = new char []{'H','E','L','L','O',',','S','E','I','R','Y','O'};
		//使用chars.length获得字符串的长度
		System.out.println("chars的长度为" + chars.length);
		//使用length属性遍历数组
		for(int i = 0;i < chars.length;++i){
			System.out.print(chars[i]);
		}
	}
}
