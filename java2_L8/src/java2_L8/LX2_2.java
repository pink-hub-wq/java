package java2_L8;

public class LX2_2 extends RW2_1{
    //吴国
    public LX2_2(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }
    public void fight() {
        System.out.println(getName() + "擅长于水域地形的搏杀");
    }
    public static void main(String[] args) {
    	LX2_2 wuguo = new LX2_2("周瑜",3,"反间",3);
        wuguo.fight();
	}
}
