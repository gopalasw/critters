import java.awt.Color;
import java.util.Random;


public class Lion extends Cat {

	private Random r = new Random();
	private boolean asleep;
	@SuppressWarnings("unused")
	private int directionIndex;
	@SuppressWarnings("unused")
	private int steps, sleepSteps, activeSteps;

/**
 * 
 */
	public Lion() {
		this.steps = 0;
		this.asleep = false;
		this.sleepSteps = this.r.nextInt(6);
		this.directionIndex = this.r.nextInt(4);
		this.activeSteps = 1;
	}

	/**
	 * @returns center, the equivalent to sleeping. Is a helper function
	 *                      for getMove
	 */
	public Direction sleep() {
		this.sleepSteps--;
		if(this.sleepSteps <= 0) {
			this.asleep = false;
			this.sleepSteps = this.r.nextInt(6);
			activeSteps++;
		}
		return Direction.CENTER;
	}
	/** @returns the next move of this Lion: Calls RandomMovement to
	 *              randomly moves in one direction for 5 steps
	 *              then in another direction for 5 steps etc. 
	 *              Every 8 steps, rests for a 0-5 amount of steps*/
	
	public Direction getMove() {
		
		if(activeSteps%8 == 0) { //when 8 moves have happened
			this.asleep = true; //the lion should sleep
		}
		if(this.asleep) //while the lion is asleep, activeSteps is not incremented
			return sleep();
		else {
			activeSteps++; //while the lion is awake, moves in accordance to RandomMovement
			return this.RandomMovement();
		}
	}

	/** @return the food type for this Lion: meat */
	@Override
	public FoodType getFoodType() {
		return FoodType.MEAT;
	}

	/** @returns the color for this Lion: orange */
	@Override
	public Color getColor() {
		return Color.ORANGE;
	}

	/** @returns the speed of this Lion: slow */
	@Override
	public Speed getSpeed() {
		return Speed.SLOW;
	}


	/** @returns the String representation of this Lion */
	public String toString() {
		if(asleep)
			return "Z";
		else
			return "L";
	}


}
