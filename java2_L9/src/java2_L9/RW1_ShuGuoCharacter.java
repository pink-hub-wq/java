package java2_L9;

public class RW1_ShuGuoCharacter extends RW1_Character{
	//���
    public RW1_ShuGuoCharacter(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }

    public void fight() {
        System.out.println(getName() + "�ó���ɽ�ص��εĲ�ɱ");
    }
}
