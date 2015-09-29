import static org.junit.Assert.*;

import org.junit.Test;



public class CritterMovementTest {
/**
 * Checks that ant moves in the correct direction when initialized with true and with false.
 */
	@Test
	public void antTest() {
		Ant antNE = new Ant(true);
		
		assertEquals("should be north", Critter.Direction.NORTH, antNE.getMove());
		assertEquals("should be east", Critter.Direction.EAST, antNE.getMove());
		assertEquals("should be north", Critter.Direction.NORTH, antNE.getMove());
		assertEquals("should be east", Critter.Direction.EAST, antNE.getMove());
		
		Ant antSW = new Ant(false);
		
		assertEquals("should be south", Critter.Direction.SOUTH, antSW.getMove());
		assertEquals("should be west", Critter.Direction.WEST, antSW.getMove());
		assertEquals("should be south", Critter.Direction.SOUTH, antSW.getMove());
		assertEquals("should be west", Critter.Direction.WEST, antSW.getMove());
		
	}
	
	/**
	 * Checks that bird moves in the correct direction with the correct icon.
	 */
	@Test
	public void birdTest() {
		Bird bird = new Bird();
		
		assertEquals("should be north", Critter.Direction.NORTH, bird.getMove());
		assertEquals("should be ∧", "∧", bird.toString());
		assertEquals("should be north", Critter.Direction.NORTH, bird.getMove());
		assertEquals("should be ∧", "∧", bird.toString());
		assertEquals("should be north", Critter.Direction.NORTH, bird.getMove());
		assertEquals("should be ∧", "∧", bird.toString());
		assertEquals("should be east", Critter.Direction.EAST, bird.getMove());
		assertEquals("should be >", ">", bird.toString());
		assertEquals("should be east", Critter.Direction.EAST, bird.getMove());
		assertEquals("should be >", ">", bird.toString());
		assertEquals("should be east", Critter.Direction.EAST, bird.getMove());
		assertEquals("should be >", ">", bird.toString());
		assertEquals("should be south", Critter.Direction.SOUTH, bird.getMove());
		assertEquals("should be ∨", "∨", bird.toString());
		assertEquals("should be south", Critter.Direction.SOUTH, bird.getMove());
		assertEquals("should be ∨", "∨", bird.toString());
		assertEquals("should be south", Critter.Direction.SOUTH, bird.getMove());
		assertEquals("should be ∨", "∨", bird.toString());
		assertEquals("should be west", Critter.Direction.WEST, bird.getMove());
		assertEquals("should be <", "<", bird.toString());
		assertEquals("should be west", Critter.Direction.WEST, bird.getMove());
		assertEquals("should be <", "<", bird.toString());
		assertEquals("should be west", Critter.Direction.WEST, bird.getMove());
		assertEquals("should be <", "<", bird.toString());
		assertEquals("should be north", Critter.Direction.NORTH, bird.getMove());
		assertEquals("should be ∧", "∧", bird.toString());
	}
	
	/**
	 * Checks that cat moves in one random direction for 5 moves, and then changes direction
	 */
	@Test
	public void catTest() {
		Cat cat = new Cat();
		Critter.Direction firstDirection = cat.getMove();
		assertEquals("should be the same the first 5 times", firstDirection, cat.getMove());
		assertEquals("should be the same the first 5 times", firstDirection, cat.getMove());
		assertEquals("should be the same the first 5 times", firstDirection, cat.getMove());
		assertEquals("should be the same the first 5 times", firstDirection, cat.getMove());
		Critter.Direction secondDirection = cat.getMove();
		assertEquals("should now have changed", secondDirection, cat.getMove());
		
	}
	
	/**
	 * Checks that lion moves in one random direction for 5 moves, and then changes direction. Also that it sleeps at 8 moves, and that the
	 *   icon changes to reflect this.
	 */
	@Test
	public void lionTest() {
		Lion lion = new Lion();
		Critter.Direction firstDirection = lion.getMove();
		assertEquals("should be the same the first 5 times", firstDirection, lion.getMove());
		assertEquals("should be the same the first 5 times", firstDirection, lion.getMove());
		assertEquals("should be the same the first 5 times", firstDirection, lion.getMove());
		assertEquals("should be the same the first 5 times", firstDirection, lion.getMove());
		assertEquals("should be L", "L", lion.toString());
		Critter.Direction secondDirection = lion.getMove();
		assertEquals("should now have changed", secondDirection, lion.getMove());
		assertEquals("should now be asleep (8th move)", Critter.Direction.CENTER, lion.getMove());
		assertEquals("should be Z", "Z", lion.toString()); //this will not necessarily be true, because the lion sometimes sleeps for 0 steps,
														  // in which case it is already awake by this point.
	}

	/**
	 * Checks that dog moves in a plus-sign movement
	 */
	@Test
	public void dogTest() {
		Dog dog = new Dog();
		
		assertEquals("should be north", Critter.Direction.NORTH, dog.getMove());
		assertEquals("should be east", Critter.Direction.EAST, dog.getMove());
		assertEquals("should be north", Critter.Direction.NORTH, dog.getMove());
		assertEquals("should be west", Critter.Direction.WEST, dog.getMove());
		assertEquals("should be north", Critter.Direction.NORTH, dog.getMove());
		assertEquals("should be west", Critter.Direction.WEST, dog.getMove());
		assertEquals("should be north", Critter.Direction.SOUTH, dog.getMove());
		assertEquals("should be west", Critter.Direction.WEST, dog.getMove());
		assertEquals("should be north", Critter.Direction.SOUTH, dog.getMove());
		assertEquals("should be west", Critter.Direction.EAST, dog.getMove());
		assertEquals("should be north", Critter.Direction.SOUTH, dog.getMove());
		assertEquals("should be west", Critter.Direction.EAST, dog.getMove());

	}

}
