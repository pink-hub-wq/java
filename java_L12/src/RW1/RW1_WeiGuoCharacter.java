package RW1;

public class RW1_WeiGuoCharacter extends RW1_Character{
	//κ��
    public RW1_WeiGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ƽԭ���εĲ�ɱ");
    }
}
