package TicTacToe.game;

public class Grid {
    private final char[] grid;
    private static Grid instance;

    public Grid() {
        this.grid = new char[9];
        initializeGrid();
    }

    public static Grid getInstance() {
        if (instance == null) {
            instance = new Grid();
        }

        return instance;
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
