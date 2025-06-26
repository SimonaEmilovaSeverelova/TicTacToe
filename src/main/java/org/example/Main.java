package org.example;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.print();
    }
}

