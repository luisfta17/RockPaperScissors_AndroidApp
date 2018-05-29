package com.example.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void canWin(){
        assertEquals("its a draw", game.getWinner("Rock"));
    }
}
