package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            FactoryTest.class,
            GameLoopTest.class,
            GameStateTest.class,
            PlayerTest.class
        }
)

public class TestSuite{}