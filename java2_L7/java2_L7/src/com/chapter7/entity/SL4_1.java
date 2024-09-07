package com.chapter7.entity;

public class SL4_1 {
	private static String ceoName = "陆兆禧";
    private String subName;

    public SL4_1(String subName) {
        this.subName = subName;
    }
    public static void ceo(){
        System.out.println("阿里巴巴CEO是：" + ceoName);
    }
    public void info(){
        System.out.println(subName + "是阿里巴巴子公司");
    }
}
