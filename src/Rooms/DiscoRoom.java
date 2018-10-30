package Rooms;

import Game.Runner;
import People.Person;

public class DiscoRoom extends Room
{

	public DiscoRoom(int x, int y) {
		super(x, y);

	}

	/**
	 * Enters the party room
	 * @param x the Person entering
	 */
	@Override
	public void enterRoom(Person x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("There was a party in the room! You started dancing to the beat.");
	}
	

}
