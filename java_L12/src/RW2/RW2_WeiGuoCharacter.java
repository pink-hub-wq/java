package RW2;

public class RW2_WeiGuoCharacter extends RW2_Character{
	//魏国
    public RW2_WeiGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "擅长于平原地形的搏杀");
    }
}
