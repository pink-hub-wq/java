package LX1;

public class LX1_MainGame {
	public static void main(String[] args) {
        LX1_Initial.cardInit();
        LX1_Initial.showWujiang();
        LX1_Actor[] actors = LX1_Initial.selectWujiang();
        for (int i = 0; i < actors.length; i++) {
        	actors[i].giveCard(4);
        	actors[i].showHandCard();
        }
        actors[0].fetchCard(2);
        actors[0].showHandCard();
        
        actors[1].fetchCard(2);
        actors[1].showHandCard();
        
        actors[0].sendShaCard();
        actors[0].showHandCard();
        
        actors[1].sendReplyCard();
        actors[1].showHandCard();
    }
}
