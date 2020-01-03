
public class EnumDemo1 {
	
	Directions dir;
	
	public EnumDemo1(Directions dir) {
		this.dir=dir;
	}

	public void getMyDirection(){
		switch(dir){
			case EAST :
				System.out.println("Direction is EAST");
				break;
			
			case WEST :
				System.out.println("Direction is WEST");
				break;
			
			case SOUTH :
				System.out.println("Direction is SOUTH");
				break;
			
			case NORTH :
				System.out.println("Direction is NORTH");
				break;
		}
	}
	public static void main(String[] args) {
		
			EnumDemo1 obj1 = new EnumDemo1(Directions.EAST);
			obj1.getMyDirection();
			EnumDemo1 obj2 = new EnumDemo1(Directions.WEST);
			obj2.getMyDirection();
			

	}

}
