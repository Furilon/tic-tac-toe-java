package TicTacToe;

import TicTacToe.game.Grid;
import TicTacToe.game.Move;
import TicTacToe.player.Player;

public class Main {
    public static void main(String[] args) {
        char y = Move.Y.getSign();
        System.out.println(y);

        Player playerY = new Player(y);
        System.out.println(playerY);
    }
}