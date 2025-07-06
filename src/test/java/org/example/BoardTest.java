package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

// User Story 3 – Unit-Tests für Board implementiert
// Dokumentationseintrag für Pull Request US3

public class BoardTest {
    private Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testPlace_validPosition() {
        board.place(1, 1, 'O');
        assertEquals('O', board.getBoard()[1][1]);
    }

    @Test
    public void testPlace_outOfBounds() {
        board.place(5, 5, 'X');  // ungültige Koordinaten
        // Erwartung: Board bleibt leer
        char[][] expected = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        assertArrayEquals(expected, board.getBoard());
    }

    @Test
    public void testClear_afterSet() {
        board.place(0, 2, 'X');
        board.clear();
        assertEquals(' ', board.getBoard()[0][2]);
    }

    @Test
    public void testIsFull_falseWhenEmpty() {
        assertFalse(board.isFull());
    }

    @Test
    public void testIsFull_trueWhenFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, 'X');
            }
        }
        assertTrue(board.isFull());
    }

    @Test
    public void testPlaceAndPrint() {
        Board board = new Board();
        board.place(0, 0, 'X');

        // Wir prüfen, ob das Zeichen 'X' an der Stelle [0][0] gesetzt wurde
        char[][] expected = {
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        assertArrayEquals(expected, board.getBoard());
    }
}

