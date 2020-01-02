
public class Final_Demo {

	static final int a;
	static
	{
		a = 5;
	}
	
	void show() {
		System.out.println("Value of A: " + a);
	}
	
	public static void main(String[] args) {
		Final_Demo FD = new Final_Demo();
		FD.show();	}

}
