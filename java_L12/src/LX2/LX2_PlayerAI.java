package LX2;

public class LX2_PlayerAI extends LX2_Actor{
	private String type = "����";

    public LX2_PlayerAI(LX2_Character character) {
        super(character);
    }
	@Override
	public String toString() {
		return "����ѡ����" + super.toString();
	}
}
