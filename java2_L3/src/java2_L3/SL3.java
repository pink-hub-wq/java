package java2_L3;

public class SL3 {
	public static void main(String[] args) {
        System.out.println("美国市场智能手机占有率比较");
        System.out.println("======================");
        double apple = 33.7;
        double samsung = 33.6;
        double lg = 8.6;
        String first,second,third;
        if(apple > samsung) {
            if (samsung > lg) {
                first = "苹果手机";
                second = "三星手机";
                third = "LG手机";
            } else {
                if (apple > lg) {
                    first = "苹果手机";
                    second = "LG手机";
                    third = "三星手机";
                } else {
                    first = "LG手机";
                    second = "苹果手机";
                    third = "三星手机";
                }
            }
        }else {
            if(apple > lg){
                first = "三星手机";
                second = "苹果手机";
                third = "LG手机";
            }else {
                if(samsung > lg){
                    first = "三星手机";
                    second = "LG手机";
                    third = "苹果手机";
                }else {
                    first = "LG手机";
                    second = "三星手机";
                    third = "苹果手机";
                }
            }
        }
        System.out.println("美国市场上，" + first + "市场占有率第一");
        System.out.println("美国市场上，" + second + "市场占有率第二");
        System.out.println("美国市场上，" + third + "市场占有率第三");
    }
}
