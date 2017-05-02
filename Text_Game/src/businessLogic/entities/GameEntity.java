package businessLogic.entities;

import java.text.DecimalFormat;

abstract public class GameEntity
{
	protected int xLocation;
	protected int yLocation;
	protected int speed;
	
	//Range for negative option
	protected final int lesserMaxBounds;
	protected final int lesserMinBounds;
	
	//Range for positive option
	protected final int greaterMinBounds;
	protected final int greaterMaxBounds;

	public GameEntity()
	{
		lesserMinBounds = -10;
		lesserMaxBounds = -4;
		greaterMinBounds = 4;
		greaterMaxBounds = 10;
	}

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
		return Integer.toString(this.getXLocation()) + "," + Integer.toString(this.getYLocation());
	}
	
	public int randomLocation(int _lesserMin, int _lesserMax, int _greaterMin, int _greaterMax)
	 {
		java.util.Random random = new java.util.Random();
		
		int greaterOption = random.nextInt((_greaterMax - _greaterMin) + 1) + _greaterMin; //Generates any number in 4 -> 10
		int lesserrOption = random.nextInt((_lesserMax - _lesserMin) + 1) + _lesserMin; //Generates any number in -4 -> -10
		
		if((random.nextInt((1 - 0 + 1) + 1) + 0) == 1) //random between 1 and 0
		{
			return greaterOption;			
		}	
		return lesserrOption;
		}


    public double getYDistance(Player _subject)
    {
		/*Distance between objects on X and Y*/
        double yDistance =  _subject.getYLocation() - this.getYLocation() ;

        return yDistance * yDistance;
    }

    public double getXDistance(Player _subject)
    {
		/*Distance between objects on X and Y*/
        double xDistance =  _subject.getXLocation() - this.getXLocation();

        return xDistance * xDistance;
    }

    public String getDistance(Player _subject)
    {
        double totalDistance = Math.sqrt(getXDistance(_subject) + getYDistance(_subject));

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        return decimalFormat.format(totalDistance);
    }
}