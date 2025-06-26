package org.example;

import java.util.Scanner;

    public class TicTacToe {
        private Player player1;
        private Player player2;
        private Player currentPlayer;
        private Board board;

        public TicTacToe() {
            player1 = new Player('X');
            player2 = new Player('O');
            currentPlayer = player1;
            board = new Board();
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);
            board.clear();

            while (true) {
                System.out.println("Current Player: " + currentPlayer.getMarker());
                board.print();

                System.out.print("Enter row (0-2): ");
                int row = scanner.nextInt();
                System.out.print("Enter column (0-2): ");
                int col = scanner.nextInt();

                if (!board.isCellEmpty(row, col)) {
                    System.out.println("Cell already taken! Try again.");
                    continue;
                }

                board.place(row, col, currentPlayer.getMarker());

                if (hasWinner()) {
                    board.print();
                    System.out.println("Player " + currentPlayer.getMarker() + " wins!");
                    break;
                }

                if (board.isFull()) {
                    board.print();
                    System.out.println("Draw! No more moves.");
                    break;
                }

                switchCurrentPlayer();
            }
        }

        public void switchCurrentPlayer() {
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        public boolean hasWinner() {
            char[][] b = board.getBoard();
            char m = currentPlayer.getMarker();

            for (int i = 0; i < 3; i++) {
                if ((b[i][0] == m && b[i][1] == m && b[i][2] == m) ||
                        (b[0][i] == m && b[1][i] == m && b[2][i] == m)) {
                    return true;
                }
            }

            if ((b[0][0] == m && b[1][1] == m && b[2][2] == m) ||
                    (b[0][2] == m && b[1][1] == m && b[2][0] == m)) {
                return true;
            }

            return false;
        }

        // Getter für Tests
        public Board getBoard() {
            return board;
        }

        public void setCurrentPlayer(Player player) {
            this.currentPlayer = player;
        }
    }


