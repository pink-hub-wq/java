package com.chapter7.entity;

public class SL2_1 {
	private String name;
    private int age;
    public SL2_1(){
        System.out.println("�޲ι��췽����ʼ��");
    }
    public SL2_1(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println(name + "��ҵ��ֹ2014���Ѿ�����" + age + "����");
    }
}
