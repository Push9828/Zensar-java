
public class Person implements Info {

	String name;
	public Person(String name) {
		this.name = name;
	}
	
	
	public void sayHello()
	{
		System.out.println("Hello from " + name);
	}	
	@Override
	public void showInfo() {
		
		System.out.println("Name of Person: " + name);
		sayHello();
	}
   
}
