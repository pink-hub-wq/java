package RW2;

public class RW2_WuGuoCharacter extends RW2_Character{
	//���
    public RW2_WuGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ˮ����εĲ�ɱ");
    }
}
