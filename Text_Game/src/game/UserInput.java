package game;

public class UserInput
{
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	public String scan(){return scan.nextLine();}
	
	public void checkInput(game.Entities.Player player1)
	{
		String input = scan().toLowerCase();
		switch (input)
		{
		case "north":
			player1.goNorth();
			break;
			
		case "south":
			player1.goSouth();
			break;
			
		case "east":
			player1.goEast();
			break;
			
		case "west":
			player1.goWest();
			break;
			
		case "quit":
			GameState game_State = GameState.getInstance();
			game_State.setState(false);
			break;
			
		default:
			System.out.println("Command Not Recognised!");
			break;
		}
	}
}
