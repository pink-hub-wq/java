package RW1;

public class RW1_WuGuoCharacter extends RW1_Character{
	//���
    public RW1_WuGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ˮ����εĲ�ɱ");
    }
}
