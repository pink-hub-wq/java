package java2_L9;

public class SL3_2 {
	public static void main(String[] args) {
        IShip ship = new SL3_1("�ൺ");
        ship.sail();
        IWeapon weapon = new SL3_1("տ����");
        weapon.fire();
        SL3_1 warship = new SL3_1("������");
        warship.sail();
        warship.fire();
    }
}
