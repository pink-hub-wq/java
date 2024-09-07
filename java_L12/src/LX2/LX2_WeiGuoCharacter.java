package LX2;

public class LX2_WeiGuoCharacter extends LX2_Character{
	//魏国
    public LX2_WeiGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "擅长于平原地形的搏杀");
    }
}
