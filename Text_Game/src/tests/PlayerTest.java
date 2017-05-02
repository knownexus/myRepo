package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.entities.Player;

public class PlayerTest
{
	int location = 0;
	int newLocation = 0;
	
	@Test
	public void moveEastTest()
	{
		Player player = new Player();
		location = player.getXLocation();
		player.goEast();
		newLocation = player.getXLocation();
		assertTrue("Player didnt move properly", newLocation == location+1);
	}

}
