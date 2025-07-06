package org.example;

public class Board {
    private char[][] cells;
    private double[][] board;
    private Object main;

    public Board() {
        cells = new char[3][3];
        clear(); // Spielfeld zu Beginn leeren
    }

    // Feld setzen
    public void place(int x, int y, char marker) {
        if (x >= 0 && x < 3 && y >= 0 && y < 3 && cells[x][y] == ' ') {
            cells[x][y] = marker;
        }
    }

    // Spielfeld ausgeben
    public void print() {
        for (char[] row : cells) {
            for (char cell : row) {
                System.out.print("|" + (cell == ' ' ? ' ' : cell));
            }
            System.out.println("|");
        }
    }

    // Spielfeld zurückgeben
    public char[][] getBoard() {
        return cells;
    }

    // Spielfeld leeren
    public void clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = ' ';
            }
        }
    }

    // Prüfen ob das Feld voll ist
    public boolean isFull() {
        for (char[] row : cells) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }
<<<<<<< HEAD
    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == ' ';

>>>>>>> origin/main
    }

}
