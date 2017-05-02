package businessLogic.entities;

import businessLogic.control.Observer;
import java.util.List;
import java.util.ArrayList;

public class Player extends GameEntity
{
    /*Observer*/
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState()
    {
        return state;
    }

    public void setState(int state)
    {
        this.state = state;

    }

    public void attach(Observer _observer)
    {
        observers.add(_observer);
    }

    public void notifyAllObservers()
    {
        for (Observer observer : observers)
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

    private void outOfBounds() //Generic call incase player tries to move out of bounds
    {
        System.out.println("You cannot go there!");
    }

    public void goNorth()
    {
        int newYPosition = this.getYLocation() + this.getSpeed();

        if (newYPosition <= this.greaterMaxBounds) //Make sure you are within the boundary of 10
        {
            this.setYLocation(newYPosition);
            notifyAllObservers();
        } else
            outOfBounds();
    }

    public void goSouth()
    {
        int newYPosition = this.getYLocation() - this.getSpeed();

        if (newYPosition >= this.lesserMinBounds) //Make sure you are within the boundary of 10
        {
            this.setYLocation(newYPosition);
            notifyAllObservers();
        } else
            outOfBounds();
    }

    public void goEast()
    {
        int newXPosition = this.getXLocation() + this.getSpeed();

        if (newXPosition <= this.greaterMaxBounds) //Make sure you are within the boundary of 10
        {
            this.setXLocation(newXPosition);
            notifyAllObservers();
        } else
            outOfBounds();
    }

    public void goWest()
    {
        int newXPosition = this.getXLocation() - this.getSpeed();

        if (newXPosition >= this.lesserMinBounds) //Make sure you are within the boundary of 10
        {
            this.setXLocation(newXPosition);
            notifyAllObservers();
        } else
            outOfBounds();
    }

    public void trap()
    {
        this.setCoords(0,0);
    }
}