package TicTacToe.player;

import TicTacToe.game.Move;

public class Player {
    private Move sign;
    private boolean move;

    public Player(Move sign) {
        this.sign = sign;
        this.move = false;
    }

    public boolean isMyMove() {
        return this.move;
    }

    public void changeMyMove() {
        this.move = !this.move;
    }

    public String toString() {
        return "Player " + this.sign.getSign();
    }
}
