package java_L13;

public class SL6 {
	public static void main(String[] args) {
        System.out.println("绝对值函数：10.02 = " + Math.abs(10.02D) + ",-10.02 = " + Math.abs(-10.02D));
        System.out.println("最大值最小值（23，12）：最大值：" + Math.max(23,12) + "，最小值：" + Math.min(23,12));
        System.out.println("四舍五入：" + "Math.round(13.6) = " + Math.round(13.6) + ",Math.round(-13.4) = " + Math.round(-13.4));
        System.out.println("三角函数sin(30) = " + Math.sin(30) + "\n\t cos(30) = " + Math.cos(30) + "\n\t tan(30) = " + Math.tan(30));
        System.out.println("开方函数：16的开方 = " + Math.sqrt(16) + "，8的立方根 = " + Math.cbrt(8));
        System.out.println("对数函数：ln(10) = " + Math.log(10));
        System.out.println("0-10之间的随机数，该随机数为double型 = " + Math.random() * 10);
    }
}
