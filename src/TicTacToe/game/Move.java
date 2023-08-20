package TicTacToe.game;

public enum Move {
    X('x'),
    Y('y');

    private final char sign;

    Move(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return this.sign;
    }
}
