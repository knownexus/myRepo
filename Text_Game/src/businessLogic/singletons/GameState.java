package businessLogic.singletons;

public class GameState
{
	static GameState ourInstance;
	boolean state = false;
	
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