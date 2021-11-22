public class BetMore_Game {

    Shuffle s;

    public BetMore_Game(Shuffle s){
        this.s = s;

    }

    public int play(){
        return s.pick_card();
    }

    public Player findWinner(Player computer, Player player_2){
        if(computer.number>player_2.number)
            return computer;
        else return player_2;
    }
}
