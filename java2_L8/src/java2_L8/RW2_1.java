package java2_L8;

public class RW2_1 {
    private String name;
    private int maxhp;
    private String skillName;
    private int hp;

    public RW2_1(String name, int maxhp, String skillName, int hp) {
        this.name = name;
        this.maxhp = maxhp;
        this.skillName = skillName;
        this.hp = hp;
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
}

