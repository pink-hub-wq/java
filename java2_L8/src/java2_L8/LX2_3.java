package java2_L8;

public class LX2_3 extends RW2_1{
    //���
    int emotion;
    public LX2_3(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ɽ�ص��εĲ�ɱ");
    }

    public LX2_3(String name, int maxhp, String skillName, int hp, int emotion) {
        this(name, maxhp, skillName, hp);
        this.emotion = emotion;
    }
}
