package RW2;

public class RW2_PlayerAI extends RW2_Actor{
	private String type = "对手";

    public RW2_PlayerAI(RW2_Character character) {
        super(character);
    }
	@Override
	public String toString() {
		return "对手选择了" + super.toString();
	}
}
