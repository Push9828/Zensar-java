
	public class Employee implements employeeInterface{
		
		int empId;
		String name;
		float salary;
		
		
	public Employee(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public void display() {
		System.out.println("EmpId: " + this.empId);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		
	}

	public static void main(String[] args) {
		Employee e = new Employee(103, "John Doe", 303220.03f);
		e.display();
	}
}
