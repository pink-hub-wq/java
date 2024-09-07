
package LX2;

public class LX2_WuGuoCharacter extends LX2_Character{
	//吴国
    public LX2_WuGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "擅长于水域地形的搏杀");
    }
}
