package RW1;

public class RW1_MainGame {
	public static void main(String[] args) {
        RW1_Initial.cardInit();
        RW1_Initial.showWujiang();
        RW1_Actor[] actors = RW1_Initial.selectWujiang();
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
