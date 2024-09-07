package java2_L9;

public class RW1_WeiGuoCharacter extends RW1_Character {
    //魏国
    public RW1_WeiGuoCharacter(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }
    public void fight() {
        System.out.println(getName() + "擅长于平原地形的搏杀");
    }
}
