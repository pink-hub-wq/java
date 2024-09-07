package java2_L9;

public class RW1_ShuGuoCharacter extends RW1_Character{
	//蜀国
    public RW1_ShuGuoCharacter(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }

    public void fight() {
        System.out.println(getName() + "擅长于山地地形的搏杀");
    }
}
