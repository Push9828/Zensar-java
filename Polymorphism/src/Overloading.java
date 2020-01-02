
class A{
	
	public int addition(int a, int b)
	{
		return a+b;
	}	
	
	public  float addition(int a, float b)
	{
		return a+b;
	}
	
	public float addtion(float a, float b)
	{
		return a+b;
		
	}
}
	
public class Overloading {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("From int int: " + a.addition(1,2));
		System.out.println("From int float: " + a.addition(1,3));
		System.out.println("From float float: " + a.addition(1,4));
		
	}

}
