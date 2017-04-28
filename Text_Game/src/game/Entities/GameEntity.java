package game.Entities;

public class GameEntity 
{
	protected int xLocation;
	protected int yLocation;
	protected int speed;
	
	//Range for negative option
	protected final int lesserMaxBounds = -4; 
	protected final int lesserMinBounds = -10;
	
	//Range for positive option
	protected final int GreaterMinBounds = 4;
	protected final int GreaterMaxBounds = 10;
	
	public int getXLocation(){return this.xLocation;}//Get x location
	public void setXLocation(int _xLocation){this.xLocation = _xLocation;}//Set x location
	
	public int getYLocation(){return this.yLocation;}//Get y location
	public void setYLocation(int _yLocation){this.yLocation = _yLocation;}//Set y location
	
	public int getSpeed(){return this.speed;}
	public void setSpeed(int _speed){this.speed = _speed;}
	
	
	public void setCoords(int _xLocation, int _yLocation)
	{
		this.xLocation = _xLocation;
		this.yLocation = _yLocation;
	}
	
	public String getCoords()
	{
		String xLocation = Integer.toString(this.getXLocation());
		String yLocation =  Integer.toString(this.getYLocation());
		
		return xLocation + "," + yLocation;
	}
	
	public int randomLocation(int _lesserMin, int _lesserMax, int _greaterMin, int _greaterMax)
	 {
		java.util.Random random = new java.util.Random();
		
		int greaterOption = random.nextInt((_greaterMax - _greaterMin) + 1) + _greaterMin; //Generates any number in 4 -> 10
		int lesserrOption = random.nextInt((_lesserMax - _lesserMin) + 1) + _lesserMin; //Generates any number in -4 -> -10
		
		if((random.nextInt((1 - 0 + 1) + 1) + 0) == 1)
		{
			return greaterOption;			
		}	
		return lesserrOption;
		}
	}