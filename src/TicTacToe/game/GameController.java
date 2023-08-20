package TicTacToe.game;

import TicTacToe.player.Player;
import TicTacToe.game.Move;

public class GameController {
    private char moveSign;

    public GameController(){
        this.moveSign = Move.X.getSign();
    }

    public Player createPlayer(Move sign) {
        return new Player(sign);
    }

    public void switchMoves(Player playerX, Player playerY) {
        if (playerX.isMyMove()) {
            this.moveSign = Move.Y.getSign();
        } else {
            this.moveSign = Move.X.getSign();
        }

        playerX.changeMyMove();
        playerY.changeMyMove();
    }
}
