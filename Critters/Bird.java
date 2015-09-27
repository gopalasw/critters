import java.awt.Color;


public class Bird extends Critter{
	
	int steps;
	Direction[] directions = {Direction.NORTH, Direction.EAST,
							  Direction.SOUTH, Direction.WEST};
	
	
	public Bird() {
		this.steps = -1;
	}

	/** @return the next move of this Bird: moves in a clockwise square of length 3 */
	@Override
	public Direction getMove() {
		this.steps++;
		return directions[(this.steps/3)%4];
		
	}

	/** @return the food type for this Bird: grass */
	@Override
	public FoodType getFoodType() {
		return FoodType.GRASS;
	}

	/** @returns the color for this Bird: red */
	@Override
	public Color getColor() {
		return Color.RED;
	}
	
	/** @returns the speed of this Bird: fast */
	@Override
	public Speed getSpeed() {
		return Speed.FAST;
	}

	
	/** @returns the String representation of this Bird */
	public String toString() {
		 Direction currentDirection = directions[(this.steps/3)%4];
		 if(currentDirection == Direction.NORTH) {
			 return "∧";
		 }
		 if(currentDirection == Direction.EAST) {
			 return ">";
		 }
		 if(currentDirection == Direction.SOUTH) {
			 return "∨";
		 }
		 else
			 return "<";
	}

}
