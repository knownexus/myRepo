package businessLogic.entities;

import businessLogic.control.Observer;

public class Trap extends GameEntity implements Observer
{
    boolean active = true;
    Player subject;

    public Trap(Player _subject)
    {
        _subject.attach(this);
        this.subject = _subject;
        setXLocation(randomLocation(this.lesserMinBounds, this.lesserMaxBounds, this.greaterMinBounds, this.greaterMaxBounds));
        setYLocation(randomLocation(this.lesserMinBounds, this.lesserMaxBounds, this.greaterMinBounds, this.greaterMaxBounds));
    }

    public boolean isActive(){return active;}

    public void setActive(boolean active){this.active = active;}

    @Override
    public void update()
    {
		/*Check for game over*/
        if(this.getCoords().equals(this.subject.getCoords()) && active == true)
        {
            subject.trap();
            System.out.println("You stood on a trap! You have been thrown back to 0,0");
            this.setActive(false);
        }
		 //For debugging
        else
        {
            System.out.println("Distance from trap: " + getDistance(this.subject));
        }
        
    }
}
