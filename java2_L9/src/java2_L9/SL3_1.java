package java2_L9;

public class SL3_1 implements IShip,IWeapon{
    String name;

    public SL3_1(String name) {
        this.name = name;
    }

    @Override
    public void sail() {
        System.out.println(name + "在茫茫大海中劈波斩浪");
    }

    @Override
    public void fire() {
        System.out.println(name + "正在发射导弹");
    }
}
