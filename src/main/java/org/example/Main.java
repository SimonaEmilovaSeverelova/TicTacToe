package org.example;

/*public class Main {
    public static void main(String[] args) {
      Player p1 = new Player('X');
System.out.println("Player 1 marker: " + p1.getMarker());

Board board = new Board();
board.place(0, 0, 'X');
board.print();
    }
} */

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.start();
    }
}