package main;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuessGameTest {

    @Test
    public void testPlay(){
        GuessGame sudoku = new GuessGame();
        Assert.assertNotNull(sudoku);
    }

    @Test
    public void testPlayingGame(){
        GuessGame sudoku = new GuessGame();
        sudoku.play();
    }

}