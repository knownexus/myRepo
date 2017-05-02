package businessLogic.singletons;

public class GameState
{
	private static GameState ourInstance;
	private boolean state = false;
	
	private GameState(){}
	
	public static GameState getInstance()
	{
		if(ourInstance == null)	ourInstance = new GameState();
		return ourInstance;
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