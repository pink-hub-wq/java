package com.mypet.entity;

public class LX2_1 {
	private String name;
    private String food;

    public LX2_1() {
    }

    public LX2_1(String name, String food) {
        this.name = name;
        this.food = food;
    }
    public void eat(String name, String food,int i){
        System.out.println(name + "ϲ����" + food);
        System.out.println(name + "ÿ���" + i + "�ͷ�");
    }
    public LX2_1(String name) {
        this.name = name;
    }

    public void eat(String food){
        System.out.println(name + "ϲ����" + food);
    }
    public void eat(int i){
        System.out.println(name + "ÿ���" + i + "�ͷ�");
    }
}
