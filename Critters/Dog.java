import java.awt.Color;

public class Dog extends Critter{
	
	public Dog() {

	}

	/** @return the next move of this Dog: moves in a clockwise plus-shape*/
	@Override
	public Direction getMove() {
		Direction choice;
		switch((info.getNumSteps()/3)%4) {
		case 0:
			if(info.getNumSteps()%2 == 0)
				choice = Direction.NORTH;
			else
				choice = Direction.EAST;
			break;
		case 1:
			if(info.getNumSteps()%2 == 0)
				choice = Direction.NORTH;
			else
				choice = Direction.WEST;
			break;
		case 2:
			if(info.getNumSteps()%2 == 0)
				choice = Direction.SOUTH;
			else
				choice = Direction.WEST;
			break;
		case 3:
			if(info.getNumSteps()%2 == 0)
				choice = Direction.SOUTH;
			else
				choice = Direction.EAST;
			break;
			default:
				choice = Direction.CENTER;
		}
		return choice;
	}

	/** @return the food type for this Dog: meat */
	@Override
	public FoodType getFoodType() {
		return FoodType.MEAT;
	}

	/** @returns the color for this Dog: yellow */
	@Override
	public Color getColor() {
		return Color.YELLOW;
	}
	
	/** @returns the speed of this Dog: fast */
	@Override
	public Speed getSpeed() {
		return Speed.FAST;
	}

	
	/** @returns the String representation of this Dog */
	public String toString() {
		 return "Q";
	}


}
