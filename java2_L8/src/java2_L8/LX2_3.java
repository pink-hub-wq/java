package java2_L8;

public class LX2_3 extends RW2_1{
    //蜀国
    int emotion;
    public LX2_3(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }
    public void fight() {
        System.out.println(getName() + "擅长于山地地形的搏杀");
    }

    public LX2_3(String name, int maxhp, String skillName, int hp, int emotion) {
        this(name, maxhp, skillName, hp);
        this.emotion = emotion;
    }
}
