
class A{
	public void print_A()
	{
		System.out.println("From class A");
	}
}

class B extends A{
	public void print_B() 
	{
		 System.out.println("From class B");
	}
	
}



public class SingleInheritance {

	public static void main(String[] args) {
		B b = new B();
		b.print_B();	
		b.print_A();
		b.print_B();
	}
}
