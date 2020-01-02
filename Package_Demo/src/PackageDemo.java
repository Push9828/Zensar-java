
import emp.employee;
import emp.mgr.*;
import emp.WageEmployee;


public class PackageDemo {

	public static void main(String[] args) {
		
		employee e = new employee();
		e.display();
		
		WageEmployee we = new WageEmployee(2001,"John Doe", 2000.00f,9,120.00f);
		we.display();
		
		Manager m = new Manager(201,"Mike", 2000.00f, 1000.00);
		m.display();
		}

}
