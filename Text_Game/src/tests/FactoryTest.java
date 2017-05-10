package tests;
//
import businessLogic.entities.Player;
import businessLogic.entities.GameEntityFactory;
import businessLogic.entities.Trap;
import businessLogic.entities.Treasure;
import org.junit.Test;
import static org.junit.Assert.*;


public class FactoryTest
{
    GameEntityFactory factory = new GameEntityFactory();

    @Test
    public void createEntityTest()
    {
        assertEquals("Not a Player", new Player().getClass(),factory.createEntity("Player").getClass());
    }


    @Test
    public void createEntity1Test()
    {
        assertEquals("Not a Treasure! ",new Treasure(new Player()).getClass(),factory.createEntity("Treasure", new Player()).getClass());
        assertEquals("Not a Trap!", new Trap(new Player()).getClass(), factory.createEntity("Trap", new Player()).getClass());
    }

}