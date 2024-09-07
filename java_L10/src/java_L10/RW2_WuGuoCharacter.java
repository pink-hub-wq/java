package java_L10;

public class RW2_WuGuoCharacter extends RW2_Character{
	//吴国
    public RW2_WuGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "擅长于水域地形的搏杀");
    }
}
