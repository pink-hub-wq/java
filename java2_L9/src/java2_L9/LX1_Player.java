package java2_L9;

public class LX1_Player extends LX1_Actor  {
    private String type = "���";

    public LX1_Player(RW1_Character character) {
        super(character);
    }
	@Override
	public void selectWuJiang() {
		System.out.println("���ѡ����" + super.toString());
	}
}
