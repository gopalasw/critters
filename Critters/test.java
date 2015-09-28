

public class test extends Ant{

	public test(boolean stepsNorth) {
		super(stepsNorth);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ant ant = new Ant(true);
		Direction current = ant.getMove();
		System.out.println(ant.info.getY());
		//assertEquals("should be north", currenty + 1, ant.info.getX());
	}

}
