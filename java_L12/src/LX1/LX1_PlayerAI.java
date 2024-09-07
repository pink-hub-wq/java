package LX1;

public class LX1_PlayerAI extends LX1_Actor{
	private String type = "对手";

    public LX1_PlayerAI(LX1_Character character) {
        super(character);
    }
	@Override
	public String toString() {
		return "对手选择了" + super.toString();
	}
}
