import java.awt.Color;


public class Ant extends Critter {
	
	boolean stepsNorth;
	int steps;
	public Ant(boolean stepsNorth) {
		this.stepsNorth = stepsNorth;
		this.steps = -1;
	}

	/** @return the next move of this Ant: alternating N and E if stepsNorth = true, else
	                                        alternating S and W */
	@Override
	public Direction getMove() {
		this.steps++;
		if(stepsNorth) {
			if(this.steps%2 == 0)
				return Direction.NORTH;
			else
				return Direction.EAST;
		}
		else {
			if(this.steps%2 == 0)
				return Direction.SOUTH;
			else
				return Direction.WEST;
		}
	}

	/** @return the food type for this Ant: grass */
	@Override
	public FoodType getFoodType() {
		return FoodType.GRASS;
	}

	/** @returns the color for this Ant: black */
	@Override
	public Color getColor() {
		return Color.BLACK;
	}
	
	/** @returns the speed of this Ant: fast */
	@Override
	public Speed getSpeed() {
		return Speed.FAST;
	}

	
	/** @returns the String representation of this Ant */
	public String toString() {
		return "%";
	}
}
