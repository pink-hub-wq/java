package java_L10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LX3_Test {
//������ҵ���Լ�ֵ�Ե���ʽչʾmap�е����ݣ���Ҫ��getһ������ȡ���
//	  map.put("bookName","java oop");
//  map.put("author", "john");
//  map.put("price", 50);//�Զ�װ��
//  map.put("price", 80);//�����ظ��ļ�:price
//  map.put(null,"nothing");//�ռ�
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
