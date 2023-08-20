package TicTacToe.game;

import TicTacToe.player.Player;

public class GameController {
    private char moveSign;
    private Grid board;

    public GameController(){
        this.moveSign = Move.X.getSign();
        this.board = new Grid();
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

        board.fill(position, this.moveSign);
    }

    public int checkForGameResult() {
        /*
        * Checks whether the game has resulted in a win, loss, or a tie
        * @returns 'x' or 'y' if there is a win
        * @returns 'T' if there is a tie
        * @returns '0' if there is no result yet and the game should continue
        * */
        char[] boardArr = board.getGrid();
        if    (isFull(boardArr) && (boardArr[0] == boardArr[1] && boardArr[1] == boardArr[2])
            || (boardArr[3] == boardArr[4] && boardArr[4] == boardArr[5])
            || (boardArr[6] == boardArr[7] && boardArr[7] == boardArr[8])
            || (boardArr[0] == boardArr[3] && boardArr[3] == boardArr[6])
            || (boardArr[1] == boardArr[4] && boardArr[4] == boardArr[7])
            || (boardArr[2] == boardArr[5] && boardArr[5] == boardArr[8])
            || (boardArr[0] == boardArr[4] && boardArr[4] == boardArr[8])
            || (boardArr[2] == boardArr[4] && boardArr[4] == boardArr[6])) {

            return this.moveSign;
        } else if (isFull(boardArr)) {
            return 'T';
        } else {
            return '0';
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

}
