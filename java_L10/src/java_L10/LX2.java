package java_L10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LX2 {
	public static void main(String[] args) {
        Map<Integer, RW2_Character> allCharacters = new HashMap<Integer, RW2_Character>();
        RW2_Character zhaoyun = new RW2_ShuGuoCharacter("赵云", 4, "龙胆", 85);
        RW2_Character caocao = new RW2_WeiGuoCharacter("曹操", 4, "奸雄");
        RW2_Character zhouyu = new RW2_WuGuoCharacter("周瑜", 3, "反间");

        allCharacters.put(zhaoyun.getId(), zhaoyun);
        allCharacters.put(caocao.getId(), caocao);
        allCharacters.put(zhouyu.getId(), zhouyu);
        
        Set<Integer> set = allCharacters.keySet();
        Iterator<Integer> integer = set.iterator();
        while (integer.hasNext()) {
			Integer id = integer.next();
			RW2_Character character = allCharacters.get(id);
			System.out.println("id:" + id + "\t姓名：" + character.getName() + "\t血量：" + character.getHp() + "\t技能：" + character.getSkillName() + "\t情义值：" + character.getEmotion());   
        }
	}
}
