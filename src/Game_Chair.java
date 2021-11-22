public class Game_Chair {

    Shuffle s;
    BetMore_Game bet;

    Player computer;
    Player player_2;

    public Game_Chair(){
        s = new Shuffle();
        bet = new BetMore_Game(s);

        computer = new Player(bet);
        player_2 = new Player(bet);

    }

    public static void main(){
        Player winner;
        Game_Chair chair = new Game_Chair();
        for(int i = 0; i < 5; i++) {
            if (chair.computer.start() == chair.computer.number)
                winner = bet.findWinner(chair.computer, chair.player_2);
            if (chair.player_2.start() == chair.player_2.number)
                winner = bet.findWinner(chair.computer, chair.player_2);
        }
    }



}
