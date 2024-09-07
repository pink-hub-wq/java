package java2_L9;

public class RW1_Player extends RW1_Actor{
    private String type = "玩家";

    public RW1_Player(RW1_Character character) {
        super(character);
    }

    @Override
    public String toString() {
        return "玩家选择了" + super.toString();
    }
}

