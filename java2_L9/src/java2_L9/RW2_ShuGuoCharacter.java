package java2_L9;

public class RW2_ShuGuoCharacter extends RW2_Character {
    //���
    private int emotion;
    public RW2_ShuGuoCharacter(String name, int maxhp, String skillName) {
        setName(name);
        setMaxhp(maxhp);
        setHp(maxhp);
        setSkillName(skillName);
    }
    public RW2_ShuGuoCharacter(String name, int maxhp, String skillName,int emotion) {
        this(name,maxhp,skillName);
        this.emotion = emotion;
    }

    @Override
    public void fight() {
        System.out.println(getName() + "�ó���ɽ�ص��εĲ�ɱ");
    }
}
