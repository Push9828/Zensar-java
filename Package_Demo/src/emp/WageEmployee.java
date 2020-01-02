package emp;

public class WageEmployee extends employee{

	 private int hours;
	 private float rate;
	 
	 public WageEmployee() {
		 super();
		 hours = 8;
		 rate = 100.00f;
		 System.out.println("Default constructor of WageEmployee");
	 }
	 
	 public WageEmployee(int empId, String name, float salary, int hours, float rate) {
		 
		 super(empId, name, salary);
		 this.hours=hours;
		 this.rate=rate;
		 System.out.println("Parameterized constructor of WageEmloyee");
		 
	 }
	 
	@Override
	public void display() {
		super.display();
		System.out.println("WageEmployee hours: " + hours + "\t Rate:" + rate);
	}
}
