package Day08;

import java.util.*;

public class Q1 {
    static String[][] board;
    static String turn = "X";

    static void printBoard() {

        System.out.println("|---|---|---|");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("|---|---|---|");
    }

    static void placeTurn(String p) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(p)) {
                    board[i][j] = turn;
                }
            }
        }
    }

    static boolean haveWon(String player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!board[i][j].equals("X") && !board[i][j].equals("O")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] arg) {
        System.out.println("Welcome to 3x3 tic tac toe game.");

        Scanner sc = new Scanner(System.in);

        board = new String[3][3];
        int a = 0;

        boolean gameOver = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = String.valueOf(a + 1);
                a++;
            }
        }

        while (!gameOver) {
            printBoard();

            System.out.println("Enter a slot number to place " + turn + " in: ");
            String p1 = sc.nextLine();

            placeTurn(p1);

            gameOver = haveWon(turn);

            if (gameOver) {
                printBoard();
                System.out.println(turn + " has Won the game.");
            } 
            
            else if (isBoardFull()) {
                printBoard();
                System.out.println("Game is a Draw!");
                gameOver = true;
            } 
            
            else {
                if (turn.equals("X")) {
                    turn = "O";
                }

                else {
                    turn = "X";
                }
            }
        }

        sc.close();
    }
}