package Rooms;

import Game.Runner;
import People.Person;

public class LosingRoom extends Room
{

	public LosingRoom(int x, int y) {
		super(x, y);

	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	public void enterRoom(Person x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the losing room... Ten points removed from Gryffindor.");
		Runner.gameOff();
	}
	

}
