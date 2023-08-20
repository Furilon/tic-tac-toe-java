package TicTacToe.player;

public class Player {
    private char sign;
    private boolean move;

    public Player(char sign) {
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
        return "Player " + this.sign;
    }
}
