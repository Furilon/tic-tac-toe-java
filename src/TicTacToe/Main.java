package TicTacToe;

import TicTacToe.game.GameController;
import TicTacToe.game.Grid;
import TicTacToe.game.Move;
import TicTacToe.player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameController game = new GameController();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to play tic-tac-toe? YES or NO: ");
            String answer = scanner.nextLine().toLowerCase().strip();

            if (answer.equals("no")) {
                System.out.println("Alright, see you next time!");
                System.exit(0);
            }

            game.playRound();
        }
    }
}