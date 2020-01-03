
public class EnumDemo {
	

	public static void main(String[] args) {
			
		Directions dir =  Directions.SOUTH;
		if(dir == Directions.EAST)
		{
			System.out.println("Direction : EAST");
		}
		else if(dir == Directions.WEST)
		{
			System.out.println("Direction : WEST");
		}
		else if (dir == Directions.SOUTH)
		{
			System.out.println("Direction : SOUTH");
		}
		else {
			System.out.println("Direction : NORTH");
		}
	}

}
