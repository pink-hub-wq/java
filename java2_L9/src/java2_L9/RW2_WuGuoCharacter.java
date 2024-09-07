package java2_L9;

public class RW2_WuGuoCharacter extends RW2_Character{
    //吴国
    private int emotion;
    public RW2_WuGuoCharacter(String name, int maxhp, String skillName) {
        setName(name);
        setMaxhp(maxhp);
        setHp(maxhp);
        setSkillName(skillName);
    }
    public RW2_WuGuoCharacter(String name, int maxhp, String skillName,int emotion) {
        this(name,maxhp,skillName);
        this.emotion = emotion;
    }

    @Override
    public void fight() {
        System.out.println(getName() + "擅长于水域地形的搏杀");
    }
}

