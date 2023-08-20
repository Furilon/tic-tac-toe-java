package TicTacToe.game;

import TicTacToe.player.Player;

public class GameController {
    private char moveSign;

    public GameController(){
        this.moveSign = Move.X.getSign();
    }

    public Player createPlayer(Move sign) {
        return new Player(sign);
    }

    public void switchMoves(Player playerX, Player playerY) {
        if (playerX.isMove()) {
            this.moveSign = Move.Y.getSign();
        } else {
            this.moveSign = Move.X.getSign();
        }

        playerX.switchMove();
        playerY.switchMove();
    }

    public void makeMove(int position) {
        if (position < 0 || position > 9){
            throw new IllegalArgumentException("Position index must be between 0 and 9 inclusively");
        }


    }
}
