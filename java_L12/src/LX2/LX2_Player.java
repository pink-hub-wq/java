package LX2;

public class LX2_Player extends LX2_Actor{
	private String type = "玩家";

    public LX2_Player(LX2_Character character) {
        super(character);
    }
	@Override
	public String toString() {
		return "玩家选择了" + super.toString();
	}
}
