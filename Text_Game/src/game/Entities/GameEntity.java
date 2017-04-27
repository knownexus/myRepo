package game.Entities;

public class GameEntity 
{
	protected int xLocation;
	protected int yLocation;
	protected int speed;

	public int getXLocation()
	{
		return this.speed;
	}
	
	public void setXLocation(int _xLocation)
	{
		this.xLocation = _xLocation;
	}
	
	public int getYLocation()
	{
		return this.speed;
	}
	
	public void setYLocation(int _yLocation)
	{
		this.yLocation = _yLocation;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void setSpeed(int _speed)
	{
		
		this.speed = _speed;
	}
	
	public void setCoords(int _xLocation, int _yLocation)
	{
		this.xLocation = _xLocation;
		this.yLocation = _yLocation;
	}
}