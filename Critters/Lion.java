import java.awt.Color;
import java.util.Random;

@NoLoad
public class Lion extends Cat {

	private Random r = new Random();
	private boolean asleep;
	private int directionIndex;
	private int steps, sleep;


	public Lion() {
		this.steps = 0;
		this.asleep = true;
		this.sleep = this.r.nextInt(6);
		this.directionIndex = this.r.nextInt(4);
	}
	
	@Override
	public Direction RandomMovement() {
		if(steps<5) {
			return Lion.Directions[directionIndex];
		}
		else {
			steps = -1;
			directionIndex = r.nextInt(4);
			return Lion.Directions[directionIndex];
		}
	}

	/** @return the next move of this Lion: Calls RandomMovement to
	 *              randomly moves in one direction for 5 steps
	 *              then in another direction for 5 steps etc. 
	 *              Every 8 steps, rests for a 0-5 amount of steps*/
	@Override
	public Direction getMove() {
		if(this.steps%8 == 0)
		{
			if(asleep)
				return sleep();
			else {
				this.steps++;
				this.asleep = true;
				return RandomMovement();
			}
		}
		else {
			this.steps++;
			return RandomMovement();
		}
		//this.steps++;
		//return RandomMovement();

	}
	
	public Direction sleep() {
		this.sleep--;
		if(this.sleep <= 0) {
			this.asleep = false;
			this.sleep = this.r.nextInt(6);
		}
		return Direction.CENTER;
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
		//if(asleep)
		//	return "Z";
		//else
			return "L";
	}


}
