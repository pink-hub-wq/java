package java_L10;

public class LX1_Test {
	public static void main(String[] args) {
		LX1_Character caocao = new LX1_WeiGuoCharacter("�ܲ�",4,"����");
		LX1_Actor player = new LX1_Actor(caocao);
		RW1_Initial.cardInit();
        player.giveCard();
        player.showHandCard();
    }
}
