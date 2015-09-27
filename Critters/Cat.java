import java.awt.Color;
import java.util.Random;


public class Cat extends Critter{

	private Random r = new Random();
	private int directionIndex;
	private int steps;
	
	
	public Cat() {
		this.steps = -1;
		this.directionIndex = this.r.nextInt(4);
	}
	
	/** @return calculation for the next move of this Cat:
	 *               Randomly moves in one direction for 5 steps
	 *               then in another direction for 5 steps etc.*/
	public Direction RandomMovement() {
		if(steps<5) {
			return Cat.Directions[directionIndex];
		}
		else {
			steps = -1;
			directionIndex = r.nextInt(4);
			return Cat.Directions[directionIndex];
		}
	}

	/** @return the next move of this Cat: calls RandomMovement() */
	@Override
	public Direction getMove() {
		this.steps++;
		return RandomMovement();
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