package businessLogic.control;

import businessLogic.entities.Player;
import businessLogic.singletons.GameState;

import java.util.Scanner;

public class UserInput
{
	public static Scanner scan = new Scanner(System.in);
	
	public static String scan(){return scan.nextLine();}
	
	public static void checkInput(Player _player1)
	{
		String input = scan().toLowerCase();
		System.out.println("===========================================");
		switch (input)
		{
		case "north":
			_player1.goNorth();
			break;
			
		case "south":
			_player1.goSouth();
			break;
			
		case "east":
			_player1.goEast();
			break;
			
		case "west":
			_player1.goWest();
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
