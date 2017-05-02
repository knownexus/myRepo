package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            tests.FactoryTest.class,
            tests.GameLoopTest.class,
            tests.GameStateTest.class,
            tests.PlayerTest.class
        }
)

public class TestSuite
{



}
