import static org.junit.Assert.*;

import org.junit.Test;



public class CritterMovementTest {

	@Test
	public void antTest() {
		Ant ant = new Ant(true);
		ant.getMove();
		int currenty = ant.info.getY();
		assertEquals("should be north", currenty + 1, ant.info.getX());
	}
	
/*
	@Test
	public void birdTest() {
		fail("Not yet implemented");
	}
	

	@Test
	public void catTest() {
		fail("Not yet implemented");
	}
	

	@Test
	public void lionTest() {
		fail("Not yet implemented");
	}
	

	@Test
	public void dogTest() {
		fail("Not yet implemented");
	}
*/
}
