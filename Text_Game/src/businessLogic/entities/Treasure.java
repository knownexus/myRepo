package businessLogic.entities;

import businessLogic.control.Observer;
import businessLogic.singletons.GameState;

public class Treasure extends GameEntity implements Observer
{
	private Player subject;
	
	public Treasure(Player _subject)
	{
		this.subject = _subject;
		_subject.attach(this);
		setXLocation(randomLocation(this.lesserMinBounds, this.lesserMaxBounds, this.greaterMinBounds, this.greaterMaxBounds));
		setYLocation(randomLocation(this.lesserMinBounds, this.lesserMaxBounds, this.greaterMinBounds, this.greaterMaxBounds));
	}

	@Override
	public void update()
	{
		/*Check for game over*/
		if(this.getCoords().equals(this.subject.getCoords()))
		{
            GameState game_state = GameState.getInstance();
			game_state.setState(false);
			System.out.println("You Win!");
		}
		/*Run if game isnt over*/
		else
        {
            System.out.println("Distance from treasure: " + getDistance(this.subject));
		}
    }


}