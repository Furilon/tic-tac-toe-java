package TicTacToe.player;

import TicTacToe.game.Move;

public class Player {
    private char sign;
    private boolean move;

    public Player(Move sign) {
        this.sign = sign.getSign();
        this.move = false;
    }

    public char getSign() {
        return this.sign;
    }

    public boolean isMove() {
        return this.move;
    }

    public void switchMove() {
        this.move = !this.move;
    }

    public String toString() {
        return "Player " + this.sign;
    }
}
