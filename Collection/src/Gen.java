

public class Gen{
	
	static <T> void gendisplay(T ele){
		
			System.out.println("Type of T is" + ele.getClass().getName());

	}
	
	
	public static void main(String[] args) {
		
		gendisplay(15);
		gendisplay("Welcome");
	}
	
}

