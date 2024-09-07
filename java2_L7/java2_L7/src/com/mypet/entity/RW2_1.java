package com.mypet.entity;

public class RW2_1 {
	private String name;

    public RW2_1(String name) {
        this.name = name;
    }

    public void eat(String food){
        System.out.println(name + "Ï²»¶³Ô" + food);
    }
    public void eat(int i){
        System.out.println(name + "Ã¿Ìì³Ô" + i + "²Í·¹");
    }
}
