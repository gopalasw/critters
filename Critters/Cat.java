import java.awt.Color;
import java.util.Random;


public class Cat extends Critter{

	Random r = new Random();
	int directionIndex;
	int steps;
	Direction[] directions = {Direction.NORTH, Direction.EAST,
							  Direction.SOUTH, Direction.WEST};
	
	
	public Cat() {
		this.steps = -1;
		directionIndex = r.nextInt(4);
	}

	/** @return the next move of this Cat: Randomly moves in one direction for 5 steps
	 *                                         then in another direction for 5 steps etc. */
	@Override
	public Direction getMove() {
		steps++;
		if(steps<5) {
			return directions[directionIndex];
		}
		else {
			steps = 0;
			directionIndex = r.nextInt(4);
			return directions[directionIndex];
		}
			
	}

	/** @return the food type for this Cat: meat */
	@Override
	public FoodType getFoodType() {
		return FoodType.MEAT;
	}

	/** @returns the color for this Cat: magenta */
	@Override
	public Color getColor() {
		return Color.MAGENTA;
	}
	
	/** @returns the speed of this Cat: medium */
	@Override
	public Speed getSpeed() {
		return Speed.MEDIUM;
	}

	
	/** @returns the String representation of this Cat */
	public String toString() {
		 return "c";
	}

}