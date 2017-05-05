package businessLogic.control;


import businessLogic.entities.Player;

public interface Observer
{
	Player subject = new Player();
	
	public abstract void update();
	
}
