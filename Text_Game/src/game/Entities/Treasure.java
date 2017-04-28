
package game.Entities;

public class Treasure extends GameEntity implements game.Observer
{
	boolean isPickedUp = false;
	Player subject;
	
	public Treasure(Player subject)
	{
		this.subject = subject;
		subject.attach(this);
		setXLocation(randomLocation(this.lesserMinBounds, this.lesserMaxBounds, this.GreaterMinBounds, this.GreaterMaxBounds));
		setYLocation(randomLocation(this.lesserMinBounds, this.lesserMaxBounds, this.GreaterMinBounds, this.GreaterMaxBounds));
	}
	
	public boolean isPickedUp()
	{
		return isPickedUp;
	}

	public void setPickedUp(boolean isPickedUp)
	{
		this.isPickedUp = isPickedUp;
	}
	

	@Override
	public void update()
	{
		if(this.getCoords().equals(subject.getCoords()))
		{
			game.GameState game_state = game.GameState.getInstance();
			game_state.setState(false);
			System.out.println("You Win!");
		}
	}
}