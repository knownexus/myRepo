package game;


public interface Observer
{
	game.Entities.Player subject = new game.Entities.Player(); 
	
	public abstract void update();
}
