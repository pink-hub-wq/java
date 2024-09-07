package com.sanguo.entity;

public class RW1 {
	private String name;
    private int maxhp;
    private String skill;
    private boolean skipUseCard;
    private int number;
    public void info(){
        System.out.println(number + "." + name +"\t"+"ÑªÁ¿£º" + maxhp + "\t" + "¼¼ÄÜ£º" + skill + "\n");
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

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
