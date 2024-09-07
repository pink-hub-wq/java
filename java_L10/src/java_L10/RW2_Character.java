package java_L10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.jws.soap.SOAPBinding;

public class RW2_Character {
	private static int count = 0;
    private int id;
    private String name;
    private int maxhp;
    private String skillName;
    private int hp;
    private int emotion;
    
	public int getEmotion() {
		return emotion;
	}

	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	public RW2_Character() {

    }

    public RW2_Character(String name, int maxhp, String skillName, int emotion) {
		super();
		this.name = name;
		this.maxhp = maxhp;
		this.skillName = skillName;
		this.emotion = emotion;
		count++;
        this.id = count;
	}

	public RW2_Character(String name, int maxhp, String skillName) {
        this.name = name;
        this.maxhp = maxhp;
        this.skillName = skillName;
        this.hp = maxhp;
        count++;
        this.id = count;
    }
    public int getId() {
        return id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    public void fight() {
        System.out.println(name + "擅长某种地形的搏杀");
    }
    public void showMsg(){
        System.out.print("武将" + name + "，他的血量是：" + maxhp + "，技能是：" + skillName +"，");
    }
}
