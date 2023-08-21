package TicTacToe.game;

import java.util.Scanner;

public class GameController {
    private char moveSign;
    private static GameController instance;
    private final Grid board;

    public GameController(){
        this.moveSign = Move.X.getSign();
        this.board = new Grid();
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }

        return instance;
    }

    public void switchMoves() {
        if (this.moveSign == Move.X.getSign()) {
            this.moveSign = Move.Y.getSign();
        } else {
            this.moveSign = Move.X.getSign();
        }
    }

    public void makeMove(int position) {
        board.fill(position, this.moveSign);
    }

    public GameResult checkForGameResult() {
        char[] boardArr = board.getGrid();

        if (isFull(boardArr)) {
            return GameResult.TIE;
        }

        // Check for win condition only if there's a possibility of winning
        if ((boardArr[0] != ' ' && boardArr[0] == boardArr[1] && boardArr[1] == boardArr[2])
                || (boardArr[3] != ' ' && boardArr[3] == boardArr[4] && boardArr[4] == boardArr[5])
                || (boardArr[6] != ' ' && boardArr[6] == boardArr[7] && boardArr[7] == boardArr[8])
                || (boardArr[0] != ' ' && boardArr[0] == boardArr[3] && boardArr[3] == boardArr[6])
                || (boardArr[1] != ' ' && boardArr[1] == boardArr[4] && boardArr[4] == boardArr[7])
                || (boardArr[2] != ' ' && boardArr[2] == boardArr[5] && boardArr[5] == boardArr[8])
                || (boardArr[0] != ' ' && boardArr[0] == boardArr[4] && boardArr[4] == boardArr[8])
                || (boardArr[2] != ' ' && boardArr[2] == boardArr[4] && boardArr[4] == boardArr[6])) {

            return GameResult.WIN;
        } else {
            return GameResult.CONTINUE;
        }
    }


    private boolean isFull(char[] board) {
        for (char element : board) {
            if (element == ' ') {
                return false;
            }
        }

        return true;
    }
    private boolean isTakenCell(int position) {
        return this.board.getGrid()[position] != ' ';
    }

    public void playRound() {
        GameResult result = checkForGameResult();
        while (result == GameResult.CONTINUE) {
            System.out.println("Whose move: " + this.moveSign);
            System.out.println("Pick a spot (0-8): ");
            Scanner scanner = new Scanner(System.in);
            int position = Integer.parseInt(scanner.nextLine());

            if (isTakenCell(position)) {
                System.out.println("This position has been taken. Pick another spot.");
                continue;
            }

            this.makeMove(position);
            System.out.println(this.board);

            result = checkForGameResult();
            if (result == GameResult.WIN) {
                System.out.println("Player " + this.moveSign + " won!");
            } else if (result == GameResult.TIE){
                System.out.println("It's a tie!");
            }

            this.switchMoves();
        }



        this.board.clear();

    }

}
