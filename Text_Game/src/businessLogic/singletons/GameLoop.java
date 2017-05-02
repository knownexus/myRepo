package businessLogic.singletons;
import businessLogic.control.UserInput;
import businessLogic.entities.Player;
import businessLogic.entities.Treasure;

public class GameLoop
{
    //private static GameLoop ourInstance = new GameLoop();
    static GameLoop ourInstance;

    private GameLoop(){}

    public static GameLoop getInstance()
    {
        if (ourInstance == null) ourInstance = new GameLoop();
        return ourInstance;
    }

    public void gameLoop(GameState _game_State, UserInput _uInput, Player _player1, Treasure _chest)
    {
        while (_game_State.getState()) //game Loop
        {
            System.out.println("Please enter a direction or type \"quit\" to quit!");
            _uInput.checkInput(_player1); //Check player1 user input

            if (_game_State.getState() == false)
                break;

            System.out.println("Your location: " + _player1.getCoords());
            //System.out.println("Chest: " + _chest.getCoords()); //for debugging
        }
    }
}
