
public class wrap {

	public static void main(String[] args) {
		
		int a = 10;
		Integer obj = new Integer(10);
		System.out.println("\tInt Data " + a +  "\tInteger data " + obj);
		
		Integer b = new Integer(a); // Auto Boxing
		
		System.out.println("\n Value of B after autoBoxing " +b);
		
		int num;
		num = obj; // Unboxing
		
		System.out.println("\n Value of B after UnBoxing " +b);

		
	}

}
