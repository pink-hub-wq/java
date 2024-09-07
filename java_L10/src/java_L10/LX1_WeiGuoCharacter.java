package java_L10;

public class LX1_WeiGuoCharacter extends LX1_Character{
	//魏国
    public LX1_WeiGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "擅长于平原地形的搏杀");
    }
}
