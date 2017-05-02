package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            tests.FactoryTest.class,
            tests.GameLoopTest.class,
            tests.GameStateTest.class
        }
)

public class TestSuite
{



}
