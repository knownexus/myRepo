package tests;

import game.businessLogic.singletons.GameState;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameStateTest
{
    GameState game_state;
    @Test
    public void getInstanceTest()
    {
        game_state = GameState.getInstance();
        assertNotNull("Game state was null!",game_state);
    }

    @Test
    public void getStateTest()
    {
        game_state = GameState.getInstance();

        assertFalse("State was not false, but was instead " + game_state.getState(), game_state.getState());
    }

    @Test
    public void setStateTest()
    {
        game_state = GameState.getInstance();
        game_state.setState(true);
    }

    @Test
    public void getStateTest2()
    {
        game_state = GameState.getInstance();

        assertTrue("State was not true, but was instead " + game_state.getState(), game_state.getState());
    }
}