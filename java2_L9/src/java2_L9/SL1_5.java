package java2_L9;

public class SL1_5 {
	public static void main(String[] args) {
        SL1_1[] games = new SL1_1[10];
        games[0] = new SL1_2();
        games[1] = new SL1_3();
        games[2] = new SL1_4();
        for (int i = 0; i < games.length; i++) {
            if(games[i] != null){
                games[i].play();
            }
        }
    }
}
