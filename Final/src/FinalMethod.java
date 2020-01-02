public class FinalMethod {
	
	
	
	final void show() {
		System.out.println("Final method in FinalMethod class");
	}

	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.show();
	}

}


class ABC extends FinalMethod {
	
	void show() {
		System.out.println("We are in ABC");
	}
}