package java2_L9;

public class RW2_Test {
	public static void main(String[] args) {
        RW2_Character character1 = null;
        character1 = new RW2_ShuGuoCharacter("����",4,"����",85);
        character1.fight();
        RW2_Character character2 = null;
        character2 = new RW2_ShuGuoCharacter("�ܲ�",4,"����",85);
        character2.fight();
        RW2_Character character3 = null;
        character3 = new RW2_ShuGuoCharacter("���",3,"����",85);
        character3.fight();
    }
}
