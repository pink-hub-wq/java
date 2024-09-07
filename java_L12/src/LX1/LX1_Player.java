package LX1;

public class LX1_Player extends LX1_Actor{
	private String type = "玩家";

    public LX1_Player(LX1_Character character) {
        super(character);
    }
	@Override
	public String toString() {
		return "玩家选择了" + super.toString();
	}
}
