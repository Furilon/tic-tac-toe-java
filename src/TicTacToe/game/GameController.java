package TicTacToe.game;

import TicTacToe.player.Player;

public class GameController {

    public Player createPlayer(Move sign) {
        return new Player(sign);
    }
}
