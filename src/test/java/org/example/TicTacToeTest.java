package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class TicTacToeTest {

        @Test
        public void testHasWinnerInRow() {
            TicTacToe game = new TicTacToe();
            Board board = game.getBoard();
            board.place(0, 0, 'X');
            board.place(0, 1, 'X');
            board.place(0, 2, 'X');
            game.setCurrentPlayer(new Player('X'));

            assertTrue(game.hasWinner());
        }

        @Test
        public void testSwitchCurrentPlayer() {
            TicTacToe game = new TicTacToe();
            Player before = new Player('X');
            game.setCurrentPlayer(before);
            game.switchCurrentPlayer();
            assertNotEquals(before.getMarker(), game.getBoard().getBoard()[0][0]); // grob
        }
    }


