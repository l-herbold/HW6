public class Player {

    BetMore_Game bet;
    int number;

    public Player(BetMore_Game bet){
        this.bet = bet;
        number = (int)((Math.random()*100)+0.5);
    }

    public int start(){
        return bet.play();
    }
}
