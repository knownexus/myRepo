package tests;

import businessLogic.singletons.GameLoop;
import org.junit.Test;

import static org.junit.Assert.*;


public class GameLoopTest
{
    GameLoop game_Loop;
    @Test
    public void getInstanceTest()
    {
        game_Loop = GameLoop.getInstance();
        assertNotNull("Game Loop was null!",game_Loop);
    }
}