package RW2;

public class RW2_WeiGuoCharacter extends RW2_Character{
	//κ��
    public RW2_WeiGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ƽԭ���εĲ�ɱ");
    }
}
