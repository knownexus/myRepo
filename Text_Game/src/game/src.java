package game;

public class src 
{
	public static void main(String[] args) 
	{
		GameState game_State = GameState.getInstance(); //create game instance
		UserInput uInput = new UserInput(); //create user input system
		
		/*Entity Creation*/
		game.Entities.Player player1 = new game.Entities.Player(); // create player1
		game.Entities.Treasure chest = new game.Entities.Treasure(player1); //Create Treasure
		game_State.setState(true);
		
		while(game_State.getState()) //game Loop
		{
			
			uInput.checkInput(player1); //Check player1 user input
			
			if(game_State.getState() == false)
				break;
			
			System.out.println("Player location: " + player1.getCoords());
			System.out.println("Chest: " + chest.getCoords());
			
			
			
			
		}
		uInput.scan.close();
		System.out.println("Thanks for playing!");
	}
}
