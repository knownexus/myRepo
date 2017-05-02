package businessLogic;

import businessLogic.control.UserInput;
import businessLogic.entities.Factory;
import businessLogic.entities.GameEntity;
import businessLogic.entities.Player;
import businessLogic.entities.Treasure;
import businessLogic.singletons.GameLoop;
import businessLogic.singletons.GameState;

public class src
{
	public static void main(String[] args) 
	{
	    /*Initialise singletons*/
        GameState game_State = GameState.getInstance(); //create game instance
        GameLoop game_Loop = GameLoop.getInstance(); //create game loop instance

        /*Initialise business logic*/
        UserInput uInput = new UserInput(); //create user input system
		
		/*Entity Creation*/
		Factory entityCreator = new Factory(); //create factory

        GameEntity player1 = entityCreator.createEntity("Player"); //Create Player1
        GameEntity chest = entityCreator.createEntity("Treasure", (Player)player1); //Create Treasure
        GameEntity trap1 = entityCreator.createEntity("Trap", (Player) player1); //create Trap
        GameEntity trap2 = entityCreator.createEntity("Trap", (Player) player1); //create Trap

        /*Set Game State*/
        game_State.setState(true);

        /*Starting Outputs*/
        System.out.println("Welcome to the game!"); //Print friendly message
        System.out.println("Distance from treasure: " + chest.getDistance((Player)player1));
        //System.out.println("Distance from trap: " + trap1.getDistance((Player)player1)); //for debugging

        /*Start Game Loop*/
		game_Loop.gameLoop(game_State, uInput, (Player)player1, (Treasure)chest);

		/*Close open systems*/
		uInput.scan.close(); //Close scanner

        /*Final Outputs*/
		System.out.println("Thanks for playing!"); //Print friendly message

	}


}
