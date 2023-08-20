package TicTacToe.game;

public class Grid {
    private final char[] grid;

    public Grid() {
        this.grid = new char[9];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < 9; i++) {
            this.grid[i] = ' ';
        }
    }

    public char[] getGrid() {
        return this.grid;
    }

    public void fill(int position, char value) {
        this.grid[position] = value;
    }

    public void clear() {
        initializeGrid();
    }

    public String toString() {
        String board = "[ ";

        for (char ch : this.grid) {
            board = board + ch + ", ";
        }

        board += "]";

        return board;
    }
}
