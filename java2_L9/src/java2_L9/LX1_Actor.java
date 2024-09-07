package java2_L9;

public abstract class LX1_Actor {
	private RW1_Character character;

    public LX1_Actor() {

    }

    public LX1_Actor(RW1_Character character) {
        this.character = character;
    }

    public RW1_Character getCharacter() {
        return character;
    }

    public void setCharacter(RW1_Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "�佫" + getCharacter().getName() + "������Ѫ���ǣ�" + getCharacter().getMaxhp() + "�������ǣ�" + getCharacter().getSkillName();
    }
    public abstract void selectWuJiang();
}
