package emp.mgr;
import emp.employee;

public class Manager extends employee {
 
	 private double incentives;
	 
	 public Manager() {
		 super();
		 incentives = 1000.00;
		 System.out.println("Default constructor of Manager");
	 }
	 
	 public Manager(int empId, String name, float salary, double incentives) {
		 
		 super(empId, name, salary);
		 this.incentives = incentives;
		 System.out.println("Parameterized constructor of Manager");
		 
	 }
	 
	 @Override
	 public void display() {
		 super.display();
		 System.out.println("Manager Incentives:" + incentives);
	}
	 
}
