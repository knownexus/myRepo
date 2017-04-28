
package game.Entities;

public class Treasure extends GameEntity
{
	boolean isPickedUp = false;

	public boolean isPickedUp()
	{
		return isPickedUp;
	}

	public void setPickedUp(boolean isPickedUp)
	{
		this.isPickedUp = isPickedUp;
	}
}