package RW2andLX2;

public class RW2_Player extends RW2_Actor{
	private String type = "玩家";

    public RW2_Player(RW2_Character character) {
        super(character);
    }
	@Override
	public String toString() {
		return "玩家选择了" + super.toString();
	}
}
