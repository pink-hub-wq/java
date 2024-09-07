package RW1;

public class RW1_WuGuoCharacter extends RW1_Character{
	//吴国
    public RW1_WuGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "擅长于水域地形的搏杀");
    }
}
