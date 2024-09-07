package java2_L8;

public class RW1_1 {
	 private String name;
	    private int maxhp;
	    private String skill;
	    private boolean skipUseCard;
	    private int number;

	    public void info() {
	        System.out.println(number + "." + name + "\t" + "血量：" + maxhp + "\t" + "技能：" + skill + "\n");
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getMaxhp() {
	        return maxhp;
	    }

	    public void setMaxhp(int maxhp) {
	        this.maxhp = maxhp;
	    }

	    public String getSkill() {
	        return skill;
	    }

	    public void setSkill(String skill) {
	        this.skill = skill;
	    }

	    public void setNumber(int number) {
	        this.number = number;
	    }

	    public void fight() {
	        System.out.println(name + "擅长某种地形的搏杀");
	    }
}
