package com.chapter7.entity;

public class SL2_1 {
	private String name;
    private int age;
    public SL2_1(){
        System.out.println("无参构造方法初始化");
    }
    public SL2_1(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println(name + "企业截止2014年已经成立" + age + "年了");
    }
}
