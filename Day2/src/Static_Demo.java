
public class Static_Demo {
	
	static int i = 0;
	
 public static void show()
 {
	 System.out.println("Inside the outer class method:" + i);
	 
	 
 }
 
 static {
	 
	 System.out.println("Static block called");
	 i++;
	 
 }
 

	public static void main(String[] args) {
		System.out.println("Main method called");
        Static_Demo.show();
	}

}
