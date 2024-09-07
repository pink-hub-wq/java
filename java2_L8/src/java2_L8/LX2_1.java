package java2_L8;

public class LX2_1 extends RW2_1{
    //魏国
    public LX2_1(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }
    public void fight() {
        System.out.println(getName() + "擅长于平原地形的搏杀");
    }
    public static void main(String[] args) {
    	LX2_1 weiguo = new LX2_1("曹操",4,"奸雄",4);
        weiguo.fight();
	}
}
