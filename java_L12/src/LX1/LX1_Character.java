package LX1;

public class LX1_Character {
	private String name;
    private int maxhp;
    private String skillName;
    private int hp;

    public LX1_Character(String name, int maxhp, String skillName) {
        this.name = name;
        this.maxhp = maxhp;
        this.skillName = skillName;
        this.hp = maxhp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void fight() {
        System.out.println(name + "擅长某种地形的搏杀");
    }
    public void showMsg(){
        System.out.print("武将" + name + "，他的血量是：" + maxhp + "，技能是：" + skillName +"，");
    }
}
