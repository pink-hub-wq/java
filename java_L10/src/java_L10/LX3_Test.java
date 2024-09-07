package java_L10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LX3_Test {
//额外作业：以键值对的形式展示map中的数据，不要用get一个个获取输出
//	  map.put("bookName","java oop");
//  map.put("author", "john");
//  map.put("price", 50);//自动装箱
//  map.put("price", 80);//出现重复的键:price
//  map.put(null,"nothing");//空键
//	  bookName java oop
//	  author   john
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("bookName", "java oop");
		map.put("author", "john");
		map.put("price", 50);
		map.put(null, "nothing");
		Set<Map.Entry<String, Object>> set = map.entrySet();
		Iterator<Entry<String, Object>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String,Object> entry = (Map.Entry<String,Object>) iterator.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}
