
class AB{
	
	public void Print_AB()
	{
		System.out.println("From AB");
	}
}

class CD extends AB{
	
	public void Print_CD()
	{
		System.out.println("From CD");
	}
}

 class EF extends CD{
	 
	 public void Print_EF()
	 {
		 System.out.println("From EF");
	 }
 }

public class Multilevel {
	public static void main(String[] args) {
		 
		 EF ef = new EF();
		 ef.Print_AB();
		 ef.Print_CD();
		 ef.Print_EF();
	}
}
