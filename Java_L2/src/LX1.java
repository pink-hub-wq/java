
public class LX1 {
	public static void main(String[] args) {
		double a = 2.5;//上山花费的时间（小时）
		int b = 2; //下山花费的时间（小时）
		int c = 300; // 上山速度（米/小时)
		int d = 4500; // 下山速度（米/小时）
        double e = a * c;//上山距离 
        int f = b * d;//下山距离
		double g = e + f;//总路程
		int h = (int)g;
        System.out.println("此人翻越这座山共走了 " + h + " 米的路程。");
	}		
}
