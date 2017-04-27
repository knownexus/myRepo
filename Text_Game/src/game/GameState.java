package game;

public class GameState 
{
	GameState game_State;
	boolean state = false;
	
	private GameState(){}
	
	public GameState getInstance()
	{
		if(game_State == null)
			game_State = new GameState();
		return game_State;
	}
	
	public boolean getState()
	{
		return state;
	}
	
	public void setState(boolean _state)
	{
		this.state = _state;
	}
}