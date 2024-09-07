package java2_L4;

public class SL11 {
	public static void main(String[] args) {
        String [] [] strArrays = {{"比尔盖茨","微软"},{"乔布斯","苹果"},{"扎克伯格","FaceBook"},{"拉里佩奇","谷歌"}};
        for (int i = 0; i < strArrays.length; i++) {
            System.out.println("公司：" + strArrays[i][1] + "\t创始人：" + strArrays[i][0]);
        }
    }
}
