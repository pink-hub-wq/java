package LX1;

public class LX1_PlayerAI extends LX1_Actor{
	private String type = "����";

    public LX1_PlayerAI(LX1_Character character) {
        super(character);
    }
	@Override
	public String toString() {
		return "����ѡ����" + super.toString();
	}
}
