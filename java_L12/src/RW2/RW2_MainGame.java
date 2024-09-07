package RW2;

public class RW2_MainGame {
	public static void main(String[] args) {
        RW2_Initial.cardInit();
        RW2_Initial.showWujiang();
        RW2_Actor[] actors = RW2_Initial.selectWujiang();
        for (int i = 0; i < actors.length; i++) {
        	actors[i].giveCard(4);
        	actors[i].showHandCard();
        }
        actors[0].fetchCard(2);
        actors[0].showHandCard();
        
        actors[1].fetchCard(2);
        actors[1].showHandCard();
    }
}
