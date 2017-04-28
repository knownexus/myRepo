package game.Entities;


public class Player extends GameEntity
{
	/*Observer*/
	private java.util.List<game.Observer> observers = new java.util.ArrayList<>();
	private int state;
	
	public int getState()
	{
		return state;
	}

	public void setState(int state)
	{
		this.state = state;
		
	}

	public void attach(game.Observer observer)
	{
		observers.add(observer);
	}
	
	public void notifyAllObservers()
	{
		for (game.Observer observer : observers)
		{
			observer.update();
		}
	}
	
	
	/*Class*/
	public Player()
	{
		setXLocation(0);
		setYLocation(0);
		setSpeed(1);
	}
	
	public Player(int _xLocation, int _yLocation)
	{
		setXLocation(_xLocation);
		setYLocation(_yLocation);
	}
	
	public void goNorth()
	{
		this.setYLocation(this.getYLocation() + this.getSpeed());
		notifyAllObservers();
	}
	
	public void goSouth()
	{
		this.setYLocation(this.getYLocation() - this.getSpeed());
		notifyAllObservers();
	}
	
	public void goEast()
	{
		this.setXLocation(this.getXLocation() + this.getSpeed());
		notifyAllObservers();
	}
	
	public void goWest()
	{
		this.setXLocation(this.getXLocation() - this.getSpeed());
		notifyAllObservers();
	}
}