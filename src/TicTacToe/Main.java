package TicTacToe;

import TicTacToe.game.GameController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameController game = GameController.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
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