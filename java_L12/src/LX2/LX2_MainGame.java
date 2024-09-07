package LX2;

public class LX2_MainGame {
	public static void main(String[] args) {
        LX2_Initial.cardInit();
        LX2_Initial.showWujiang();
        LX2_Actor[] actors = LX2_Initial.selectWujiang();
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
