
public class MyException1 extends Exception {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public MyException1(String meassage) {
		
		super(meassage);
	}

}


 class testException {
	
	 static int num3;
	 
	 public static void main(String[] args) {
				
	num3 = 8/3;
	try {
		if(num3<3){
			throw new MyException1("Yes");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
 }
	 
}